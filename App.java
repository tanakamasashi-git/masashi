
public class App {
    public static void main(String[] args) {
        // masashi.role("gomi");　//ロールを入力するとジョブが表示されるよ！
        // masashi.Damage("連撃,連撃");  //スキルを,区切りで入力すると合計ダメージがでるよ！（連撃のみ対応）
        masashi.total("1|連撃|310\n2|連撃|310\n3|双竜脚|250"); //秒数|技名|威力を入力すると各技のトータルダメージと平均ダメージキャスと回数が出るよ。
    }
}