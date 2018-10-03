import java.util.Scanner;

/**
 * Created by Andreas on 2018/10/3.
 */
public class Dashabi {
    public static void main(String[] args) {
        String name;
        String content;
        String call;
        String member_sign;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入无知群众说话内容：（7号要开会吗。）");
        content = sc.nextLine();
        if(content.isEmpty())
            content = "7号要开会吗。";
        System.out.println("请输入尊敬的主席的姓名：（杨某）");
        name = sc.nextLine();
        if(name.isEmpty())
            name = "杨某";
        System.out.println("请输入无知群众对敬爱的主席的称呼：（学长）");
        call = sc.nextLine();
        if(call.isEmpty())
            call = "学长";
        System.out.println("请输入群众的称呼：（试用干事）");
        member_sign = sc.nextLine();
        if(member_sign.isEmpty())
            member_sign = "试用干事";

        System.out.println("");
        System.out.println("--begin--");
        System.out.println(content+"@"+name+" "+call);
        System.out.println(name.charAt(0)+"主席是你们直接@的？现在你是在叫"+call+"？我不想看见第二次。");
        System.out.println("他妈自己没点数？");
        System.out.println("请各位"+member_sign+"以后注意自己的身份和说话方式@全体成员");
        System.out.println("--end--");
    }
}

/**
 *  “我当上了学生会主席，我牛逼，我接天叶无穷！你们都是渣渣，颤抖吧，人类！”
 *                                                       ----某学生会主席
 */
