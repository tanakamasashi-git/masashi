import java.util.Arrays;

public class masashi {
    public static void main(String[] args) {
        System.out.println("aaaa");
    }

    public static String Healer(){
        String[] Healer= {"学","賢","白","占"};
        return Arrays.toString(Healer);
    }

    public static String Dps(){
        String[] Dps= {"モンク","侍","たこやき","リーパー","竜騎士","貴公子","踊る子","死人"};
        return Arrays.toString(Dps);
    }

    public static String Tank() {
    String[] Tank ={"ナイト","暗黒","ガンブレ","戦士"};
    return Arrays.toString(Tank);
    }

    public static void role(String role1) {
        if(role1== "タンク"){
            System.out.println(Tank());
        }else if(role1== "ヒーラー"){
            System.out.println(Healer());
        }else if(role1== "DPS"){
            System.out.println(Dps());
        }else{
            System.out.println("ンなもんねーよ殺すぞ");
        };
    }

}

