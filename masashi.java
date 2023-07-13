import java.util.Arrays;
import java.util.regex.Pattern;

public class masashi {
    public static void main(String[] args) {
        
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

    public static String[] rale(String rale){
        String[] a= rale.split(",");
        return a;
    }

    public static int skill(String skill1){
        String skill;
        int Damage;
        // if(skill1=="連撃"){   ==をつかうなぼけかすほんまごみ2時間悩んだしね　https://www.sejuku.net/blog/14621
        if(skill1.equals("連撃")){
            skill= "310";
            Damage= Integer.parseInt(skill);
        }else if(skill1.equals("")){
            skill= "20";
        }else{
            skill= "15";
        }

        Damage= Integer.parseInt(skill);
        return Damage;
    }


    public static void Damage(String skill){
        int damage = 0;

        String[] a=rale(skill);
        for(int i=0; i<a.length; i++){
            System.out.println(a[0]);
            damage = damage+ skill(a[i]);
            System.out.println(damage);
        };

        System.out.println(Arrays.toString(rale(skill)));
    }

    public static void total(String data){
        String a="あ";

        // int sum= 0;
        // for(int i=0; i<data_string(data).length; i++){
        //     sum = Integer.parseInt(data_string(data)[i]);
        // }
        // String c= String.valueOf(sum);

        System.out.println("トータルダメージ："+a+"\n"+Arrays.toString(data_string(data)));
    }

    public static String[] data_string(String motodata){
        String[] hai= motodata.split("\n");
        String[] yoh = new String[3];  //中身の数を決めておく？newってなんやねん..こうしないと一生forの中でエラー。String[] yoh;だとだめ
        String[] time = new String[hai.length];
        String[] skill_name= new String[hai.length];
        String[] damage= new String[hai.length];


        for(int i=0; i<hai.length; i++){
            yoh= hai[i].split(Pattern.quote("|"));
            time[i]= yoh[0];
            skill_name[i]= yoh[1];
            damage[i]= yoh[2];
        }

        // yoh= hai[0].split(Pattern.quote("|"));
        // String[] hairetsu= hai;
        return damage;
    }

}

