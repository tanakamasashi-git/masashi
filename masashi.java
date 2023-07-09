import java.util.Arrays;

public class masashi {
    public static void main(String[] args) {
        System.out.println("aaaa");
    }
    public static String Tank() {
    
    String[] Tank ={"ナイト","暗黒","ガンブレ","戦士"};
    // String[] Melee= {"モンク","侍","たこやき","リーパー","竜騎士"};
    // String[] Range= {"貴公子","踊る子","死人"};
    // String[] Mage= {"黒魔","赤魔","召喚"};
    // String[] Baria= {"学","賢"};
    // String[] Pure= {"白","占"};
    // String[] Healer= {"学","賢","白","占"};
    //     Baria,
    //     Pure
    // };
    // String[] Dps= {"モンク","侍","たこやき","リーパー","竜騎士","貴公子","踊る子","死人"};
    //     Melee, Range
    // };
    return Arrays.toString(Tank);

    // if(role== "タンク"){
    //     return Arrays.toString(Tank);
    // }else if(role== "ヒーラー"){
    //     return Arrays.toString(Healer);
    // }else if(role== "Dps"){
    //     return Arrays.toString(Dps);
    // }

    // String[][][] job ={
    //     Tank,
    //     Dps,
    //     Healer,
    // };
    }

    public static void role(String role1) {
        if(role1== "タンク"){
            System.out.println((Tank()));
        }else{
            System.out.println("ンなもんねーよ殺すぞ");
        };
    }

}

