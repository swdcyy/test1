package fa.a;
import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.Integer;

public class a	// class@001fda
{
    public static final long[] a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static SimpleDateFormat f;

    static {
       a.a = new long[201]{0x4bd8,0x4ae0,0xa570,0x54d5,0xd260,0xd950,0x16554,0x56a0,0x9ad0,0x55d2,0x4ae0,0xa5b6,0xa4d0,0xd250,0x1d255,0xb540,0xd6a0,0xada2,0x95b0,0x14977,0x4970,0xa4b0,0xb4b5,0x6a50,0x6d40,0x1ab54,0x2b60,0x9570,0x52f2,0x4970,0x6566,0xd4a0,0xea50,0x6e95,0x5ad0,0x2b60,0x186e3,0x92e0,0x1c8d7,0xc950,0xd4a0,0x1d8a6,0xb550,0x56a0,0x1a5b4,9680,0x92d0,0xd2b2,0xa950,0xb557,0x6ca0,0xb550,0x15355,0x4da0,0xa5b0,0x14573,0x52b0,0xa9a8,0xe950,0x6aa0,0xaea6,0xab50,0x4b60,0xaae4,0xa570,0x5260,0xf263,0xd950,0x5b57,0x56a0,0x96d0,0x4dd5,0x4ad0,0xa4d0,0xd4d4,0xd250,0xd558,0xb540,0xb6a0,0x195a6,0x95b0,0x49b0,0xa974,0xa4b0,0xb27a,0x6a50,0x6d40,0xaf46,0xab60,0x9570,0x4af5,0x4970,0x64b0,0x74a3,0xea50,0x6b58,0x55c0,0xab60,0x96d5,0x92e0,0xc960,0xd954,0xd4a0,0xda50,0x7552,0x56a0,0xabb7,9680,0x92d0,0xcab5,0xa950,0xb4a0,0xbaa4,0xad50,0x55d9,0x4ba0,0xa5b0,0x15176,0x52b0,0xa930,0x7954,0x6aa0,0xad50,0x5b52,0x4b60,0xa6e6,0xa4e0,0xd260,0xea65,0xd530,0x5aa0,0x76a3,0x96d0,0x4afb,0x4ad0,0xa4d0,0x1d0b6,0xd250,0xd520,0xdd45,0xb5a0,0x56d0,0x55b2,0x49b0,0xa577,0xa4b0,0xaa50,0x1b255,0x6d20,0xada0,0x14b63,0x9370,0x49f8,0x4970,0x64b0,0x168a6,0xea50,0x6b20,0x1a6c4,0xaae0,0xa2e0,0xd2e3,0xc960,0xd557,0xd4a0,0xda50,0x5d55,0x56a0,0xa6d0,0x55d4,0x52d0,0xa9b8,0xa950,0xb4a0,0xb6a6,0xad50,0x55a0,0xaba4,0xa5b0,0x52b0,0xb273,0x6930,0x7337,0x6aa0,0xad50,0x14b55,0x4b60,0xa570,0x54e4,0xd160,0xe968,0xd520,0xdaa0,0x16aa6,0x56d0,0x4ae0,0xa9d4,0xa2d0,0xd150,0xf252,0xd520};
       String[] stringArray = new String[]{"","正","二","三","四","五","六","七","八","九","十","冬","腊"};
       a.b = stringArray;
       stringArray = new String[]{"甲","乙","丙","丁","戊","己","庚","辛","壬","癸"};
       a.c = stringArray;
       stringArray = new String[]{"子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"};
       a.d = stringArray;
       stringArray = new String[]{"鼠","牛","虎","兔","龙","蛇","马","羊","猴","鸡","狗","猪"};
       a.e = stringArray;
       a.f = new SimpleDateFormat("yyyy年M月d日 EEEEE");
    }
    public static ArrayList a(int p0){
       String str;
       ArrayList uArrayList = new ArrayList();
       for (int i = 1; i <= p0; i = i + 1) {
          if (i == 10) {
             str = "初十";
          }else if(i == 20){
             str = "二十";
          }else if(i == 30){
             str = "三十";
          }else {
             int i1 = i / 10;
             String str1 = (!i1)? "初": "";
             if (i1 == 1) {
                str1 = "十";
             }
             if (i1 == 2) {
                str1 = "廿";
             }
             if (i1 == 3) {
                str1 = "三";
             }
             i1 = i % 10;
             switch (i1){
                 case 1:
                   str = str1+"一";
                   break;
                 case 2:
                   str = str1+"二";
                   break;
                 case 3:
                   str = str1+"三";
                   break;
                 case 4:
                   str = str1+"四";
                   break;
                 case 5:
                   str = str1+"五";
                   break;
                 case 6:
                   str = str1+"六";
                   break;
                 case 7:
                   str = str1+"七";
                   break;
                 case 8:
                   str = str1+"八";
                   break;
                 case 9:
                   str = str1+"九";
                   break;
                 default:
                   str = str1;
             }
          }
          uArrayList.add(str);
       }
       return uArrayList;
    }
    public static ArrayList b(int p0){
       ArrayList uArrayList = new ArrayList();
       int i = 1;
       String[] b = a.b;
       while (i < b.length) {
          uArrayList.add(b[i]+"月");
          i = i + 1;
       }
       if (a.e(p0)) {
          uArrayList.add(a.e(p0), "闰"+b[a.e(p0)]+"月");
       }
       return uArrayList;
    }
    public static ArrayList c(int p0,int p1){
       int i;
       int i1;
       ArrayList uArrayList = new ArrayList();
       for (; p0 < p1; p0++) {
          Object[] objArray = new Object[]{a.c[i1]+a.d[i]+"年",Integer.valueOf(p0)};
          i = p0 - 4;
          i1 = i % 10;
          i = i % 12;
          uArrayList.add(String.format("%s\(%d\)", objArray));
       }
       return uArrayList;
    }
    public static final int d(int p0){
       if (!a.e(p0)) {
          return 0;
       }
       if (a.a[(p0 - 1900)] & 0x10000) {
          return 30;
       }
       return 29;
    }
    public static final int e(int p0){
       return (int)(a.a[(p0 - 1900)] & 15);
    }
    public static final int f(int p0,int p1){
       if (!((long)(0x10000 >> p1) & a.a[(p0 - 1900)])) {
          return 29;
       }
       return 30;
    }
}
