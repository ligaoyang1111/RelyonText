package com.jiuji.time;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.util.Date;

/**
 * 1.4.3之后时间格式用的这
 */
public class TimesUtils {
    /**
     * 返回文字描述的日期
     *
     * @param inTime
     * @return
     */
    private final static long minute = 60 * 1000;// 1分钟
    private final static long hour = 60 * minute;// 1小时
    private final static long day = 24 * hour;// 1天
    private final static long month = 31 * day;// 月
    private final static long year = 12 * month;// 年
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String timeUtile(Date inTime) {
        // 拿到当前时间戳和发布时的时间戳，然后得出时间戳差
        Date today = new Date();
        String creenYEAR = new SimpleDateFormat("yyyy").format(today);
        String creenMONTH = new SimpleDateFormat("MM").format(today);
        String creenDay = new SimpleDateFormat("dd").format(today);
        String creenHOUR = new SimpleDateFormat("HH").format(today);
        String creenMINUTE = new SimpleDateFormat("mm").format(today);
        String creenSECOND = new SimpleDateFormat("ss").format(today);
        DateFormat dfy = new SimpleDateFormat("yyyy");
        String thatYEAR = dfy.format(inTime);
        DateFormat dfM = new SimpleDateFormat("MM");
        String thatMONTH = dfM.format(inTime);
        DateFormat dfd = new SimpleDateFormat("dd");
        String thatDay = dfd.format(inTime);
        DateFormat dfh = new SimpleDateFormat("HH");
        String thatHOUR = dfh.format(inTime);
        DateFormat dfm = new SimpleDateFormat("mm");
        String thatMINUTE = dfm.format(inTime);
        DateFormat dfs = new SimpleDateFormat("ss");
        String thatSECOND = dfs.format(inTime);
        long diff = new Date().getTime() - inTime.getTime();
        long r = 0;
        //Log.e("exceedDayexceedDay", creenYEAR + "--" + creenMONTH + "--" + Integer.valueOf(creenDay) + "---" + Integer.valueOf(creenHOUR) + "--" + creenMINUTE + "---" + creenSECOND);
        if (creenYEAR.equals(thatYEAR)) {
            if (creenMONTH.equals(thatMONTH)) {
                if (creenDay.equals(thatDay)) {
                    //当天
                    if (diff > hour) {
                        r = (diff / hour);
                        return r + "小时前";
                    }
                    if (diff > minute) {
                        r = (diff / minute);
                        return r + "分钟前";
                    }
                    return "刚刚";
                   /* if (creenHOUR.equals(thatHOUR)) {
                        //同1分钟
                        if (creenMINUTE.equals(thatMINUTE)) {
                            return "刚刚";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 1) {
                            return "1分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 2) {
                            return "2分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 3) {
                            return "3分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 4) {
                            return "4分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 5) {
                            return "5分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 6) {
                            return "6分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 7) {
                            return "7分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 8) {
                            return "8分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 9) {
                            return "9分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 10) {
                            return "10分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 11) {
                            return "11分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 12) {
                            return "12分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 13) {
                            return "13分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 14) {
                            return "14分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 15) {
                            return "15分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 16) {
                            return "16分钟";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 17) {
                            return "17分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 18) {
                            return "18分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 19) {
                            return "19分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 20) {
                            return "20分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 21) {
                            return "21分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 22) {
                            return "22分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 23) {
                            return "23分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 24) {
                            return "24分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 25) {
                            return "25分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 26) {
                            return "26分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 27) {
                            return "27分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 28) {
                            return "28分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 29) {
                            return "29分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 30) {
                            return "30分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 31) {
                            return "31分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 32) {
                            return "32分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 33) {
                            return "33分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 34) {
                            return "34分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 35) {
                            return "35分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 36) {
                            return "36分钟前";
                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 37) {
                            return "37分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 38) {
                            return "38分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 39) {
                            return "39分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 40) {
                            return "40分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 21) {
                            return "41分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 42) {
                            return "42分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 43) {
                            return "43分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 44) {
                            return "44分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 45) {
                            return "45分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 46) {
                            return "46分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 47) {
                            return "47分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 48) {
                            return "48分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 49) {
                            return "49分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 50) {
                            return "51分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 51) {
                            return "51分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 52) {
                            return "52分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 53) {
                            return "53分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 54) {
                            return "54分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 55) {
                            return "55分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 56) {
                            return "56分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 57) {
                            return "57分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 58) {
                            return "58分钟前";

                        } else if (Integer.valueOf(creenMINUTE) - Integer.valueOf(thatMINUTE) == 59) {
                            return "59分钟前";

                        }
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 1) {
                        return "1小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 2) {
                        return "2小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 3) {
                        return "3小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 4) {
                        return "4小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 5) {
                        return "5小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 6) {
                        return "6小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 7) {
                        return "7小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 8) {
                        return "8小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 9) {
                        return "9小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 10) {
                        return "10小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 11) {
                        return "11小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 12) {
                        return "12小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 13) {
                        return "13小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 14) {
                        return "14小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 15) {
                        return "15小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 16) {
                        return "16小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 17) {
                        return "17小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 18) {
                        return "18小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 19) {
                        return "19小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 20) {
                        return "20小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 21) {
                        return "21小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 22) {
                        return "22小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 23) {
                        return "23小时前";
                    } else if (Integer.valueOf(creenHOUR) - Integer.valueOf(thatHOUR) == 24) {
                        return "24小时前";
                    }*/
                } else if (Integer.valueOf(creenDay) - Integer.valueOf(thatDay) == 1) {
                    return "昨天";
                } else if (Integer.valueOf(creenDay) - Integer.valueOf(thatDay) == 2) {
                    return "2天前";
                } else if (Integer.valueOf(creenDay) - Integer.valueOf(thatDay) == 3) {
                    return "3天前";
                } else if (Integer.valueOf(creenDay) - Integer.valueOf(thatDay) == 4) {
                    return "4天前";
                } else if (Integer.valueOf(creenDay) - Integer.valueOf(thatDay) == 5) {
                    return "5天前";
                } else if (Integer.valueOf(creenDay) - Integer.valueOf(thatDay) == 6) {
                    return "6天前";
                } else if (Integer.valueOf(creenDay) - Integer.valueOf(thatDay) == 7) {
                    return "7天前";
                }
            }
            return "正常";
        }
        return "正常";
    }
}

