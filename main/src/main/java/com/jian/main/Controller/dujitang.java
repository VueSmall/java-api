//author:steam-404
//随机毒鸡汤
package com.jian.main.Controller;

import java.util.Random;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dujitang {
    @RequestMapping("/dujitang")
    // localhost:8080/dujitang
    public String jitang() {
        String[] message = {
                "只要坚持下去，总会有失败的一天。",
                "不是没脾气，是不敢有脾气，因为没人哄真的很尴尬。",
                "虽然你长得丑，不过，没关系，可是你想得美呀 ",
                "万事开头难，中间难，最后结尾难。",
                "现在的人天天手机不离手，要回你消息早就回了，单身没关系，以后单身的日子还长着呢。",
                "你以为有钱人很快乐吗?他们的快乐，你根本想象不到。",
                "有时候你不努力一下，就不知道什么叫绝望。",
                "不要看别人表面上一帆风顺，实际上他们背地里，也是一帆风顺。",
                "假如生活欺骗了你，不要悲伤，不要心急，反正明天也一样。",
                "喜欢一个人就去表白，万一成备胎了呢。",
                "吃得苦中苦，方为人上人，我并不想做什么人上人，可这世间疾苦，照样没能放过我。",
        };
        Random random=new Random();
        int num=random.nextInt(message.length);

        return message[num];
    }
}
