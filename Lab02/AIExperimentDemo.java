public class AIExperimentDemo {
 
    // helper method - receives a reference and mutates the real object
    static void addBonusRun(AIExperiment exp) {
        exp.runEpochs(5);
    }
 
    public static void main(String[] args) {
        AIExperiment exp1 = new AIExperiment();
        exp1.experimentName = "Image Classifier";
        exp1.completedEpochs = 10;
        exp1.targetEpochs = 50;
 
        AIExperiment exp2 = new AIExperiment();
        exp2.experimentName = "Chatbot Fine-tune";
        exp2.completedEpochs = 5;
        exp2.targetEpochs = 30;
 
        System.out.println("Initial state:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());
 
        exp1.runEpochs(8);
        exp2.runEpochs(4, 2);
 
        System.out.println();
        System.out.println("After running epochs:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());
 
        System.out.println();
        System.out.println("Remaining epochs:");
        System.out.println(exp1.experimentName + " remaining: " + exp1.remainingEpochs());
        System.out.println(exp2.experimentName + " remaining: " + exp2.remainingEpochs());
 
        addBonusRun(exp1);
        System.out.println();
        System.out.println("After helper method bonus run on exp1:");
        System.out.println(exp1.status());
    }
}
