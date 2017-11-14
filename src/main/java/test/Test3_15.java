package test;

class Pancake {
    String s="pancake";
    static String sStatic="pancakeStat";
    String cevaNonStat(){
        return "metpack";
    }
    static String cevaStatic(){
        return "statmetpank";
    }
}
  class BlueberryPancake extends Pancake {
    String s="blue";
      static String ss="blueStat";
      String cevaNonStat(){
          return "metblue";
      }
      static String cevaStatic(){
          return "statmetblue";
      }

  }
   class SourdoughBlueberryPancake2 extends BlueberryPancake {
    String s="sour";
       static String ss="sourStat";
       String cevaNonStat(){
           return "metsour";
       }
       static String cevaStatic(){
           return "statmetsour";
       }
  }
  class Test{
    private String sss;
    private static String ss;
    final int f=0;
      class Test1{
        private int a;
        final int b=1;

        void met() {
            String s = ss;
            ss="s";
            int a=f;

        }
    }
  }
public class Test3_15 {
    public static void main(String[] args) {
        Pancake p4 = new SourdoughBlueberryPancake2();
        // insert code here
       System.out.println(p4.cevaNonStat()+ " "+ p4.s + " "+ p4.cevaStatic()+ " " +p4.sStatic);
        Pancake p5=p4;
        System.out.println(p5.cevaNonStat()+ " "+ p5.s + " "+ p5.cevaStatic()+ " " +p5.sStatic);
        Pancake p6=(BlueberryPancake)p4;
        System.out.println(p6.cevaNonStat()+ " "+ p6.s + " "+ p6.cevaStatic()+ " " +p6.sStatic);
        BlueberryPancake bp= (BlueberryPancake) p4;
        System.out.println(bp.cevaNonStat()+ " "+ bp.s + " "+ bp.cevaStatic()+ " " +bp.ss);
        BlueberryPancake bs=(SourdoughBlueberryPancake2)p4;
        System.out.println(bs.cevaNonStat()+ " "+ bs.s + " "+ bs.cevaStatic()+ " " +bs.ss);
        SourdoughBlueberryPancake2 s= (SourdoughBlueberryPancake2) p4;
        System.out.println(s.cevaNonStat()+ " "+ s.s + " "+ s.cevaStatic()+ " " +s.ss);
        Boolean b= Boolean.valueOf("tRuE");
        System.out.println(b);








    }
}
