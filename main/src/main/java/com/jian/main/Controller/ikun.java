//author:steam-404
//随机输出坤坤语录
package com.jian.main.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ikun {
    @RequestMapping("/ikun")
    // localhost:8080/ikun
    public String kunkun() {
        String[] ikunNote = {
                "向阳花木易为春，听说你爱蔡徐坤。",
                "千军万马是ikun，ikun永远爱坤坤。",
                "待我ikun更强大，定帮坤哥赢天下。",
                "两耳不闻窗外事，一心只为蔡徐坤。",
                "追梦少年不失眠，未来可期蔡徐坤。",
                "向阳花木每逢春，ikun一直爱坤坤。",
                "落红飞雪漫纷纷，心头只有蔡徐坤。",
                "红塔楼是烟，蔡徐坤是天。",
                "立场很简单，就是蔡徐坤。",
                "狮子座为王，蔡徐坤为皇。"
        };
        int messageLength = ikunNote.length;
        Random random = new Random();
        int num = random.nextInt(messageLength);
        return ikunNote[num];
    }
}
