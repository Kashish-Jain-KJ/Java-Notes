class GenericEngine { public String engType="GE-001"; }

class CombustionEngine extends GenericEngine { 
    public String engType="CE-002"; }

class JetEngine extends CombustionEngine { 
    public String engType="JE-003"; }

 class Car {
     public static void main(String[] args){
        JetEngine e = new JetEngine();
        new Car().setEngine(e);
    }

    public void setEngine(JetEngine ce) {
        System.out.printf(
            "I have JetEngine engine: %s", ce.engType);
    }
    public void setEngine(Object o) {
        System.out.print("I have unknown engine");
    }
    public void setEngine(GenericEngine ge) {
        System.out.printf(
            "I have generic engine: %s", ge.engType);
    }

    public void setEngine(CombustionEngine ce) {
        System.out.printf(
            "I have combustion engine: %s", ce.engType);
    }
    
}