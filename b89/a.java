package b89.a;
import b89.a$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.regex.Pattern;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$TYPE;
import b89.a$c;
import b89.a$b;
import android.text.SpannableStringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan;
import b89.a$d;

public final class a	// class@000390
{
    public final Pattern a;
    public a$b b;
    public a$c c;
    public RoundIconTagSpan$TYPE d;
    public final QPhoto e;
    public final String f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final float o;
    public final float p;
    public final int q;
    public static final a$a r;

    static {
       a.r = new a$a(null);
    }
    public void a(QPhoto p0,String p1,boolean p2,int p3,int p4,int p5){
       super(p0, p1, p2, p3, p4, p5, 0, 0, 0, 0, 0, 0, 0, 8128, null);
    }
    public void a(QPhoto p0,String p1,boolean p2,int p3,int p4,int p5,int p6,int p7,int p8,int p9,float p10,float p11,int p12,int p13,u p14){
       int i = this;
       Object obj = p0;
       Object obj1 = p1;
       int i1 = p13;
       boolean b = (i1 & 0x04)? true: p2;
       int i2 = 0;
       int i3 = (i1 & 0x08)? 0: p3;
       int i4 = (i1 & 0x10)? a1.a(R.color.arg_RES_7f060788): p4;
       int i5 = (i1 & 0x20)? a1.a(R.color.arg_RES_7f060624): p5;
       int i6 = (i1 & 0x40)? 0: p6;
       int i7 = (i1 & 0x0080)? 0: p7;
       int i8 = (i1 & 0x0100)? 0: p8;
       if (!(i1 & 0x0200)) {
          i2 = p9;
       }
       float f = (i1 & 0x0400)? 0: p10;
       float f1 = (i1 & 0x0800)? (float)a1.d(0x7f070f71): p11;
       i1 = (i1 & 0x1000)? a1.d(R.dimen.arg_RES_7f070283): p12;
       a.p(obj, "mPhoto");
       a.p(obj1, "mTagArea");
       super();
       i.e = obj;
       i.f = obj1;
       i.g = b;
       i.h = i3;
       i.i = i4;
       i.j = i5;
       i.k = i6;
       i.l = i7;
       i.m = i8;
       i.n = i2;
       i.o = f;
       i.p = f1;
       i.q = i1;
       i.a = Pattern.compile("\\$\\$\\{\([23]\)\\|\(\\w+\)\\|\(\\d+\)\\}\(.+?\)\\$\\$");
       i.d = RoundIconTagSpan$TYPE.ANCHOR;
       return;
    }
    public final a$c a(){
       return this.c;
    }
    public final void b(a$b p0){
       this.b = p0;
    }
    public final void c(SpannableStringBuilder p0){
       a$c uoc = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, uoc, a.class, "1")) {
          return;
       }
       a.p(obj, "$this$update");
       Matcher matcher = uoc.a.matcher(obj);
       while (matcher.find()) {
          String str = matcher.group(2);
          String str1 = "";
          if (str == null) {
             str = str1;
          }
          String str2 = matcher.group(4);
          if (str2 != null) {
             str1 = str2;
          }
          str2 = matcher.group(1);
          if (str2 == null) {
             str2 = "2";
          }
          uoc.c = new a$c(str, str1, str2);
          int i = matcher.start();
          obj.replace(i, matcher.end(), str1);
          RoundIconTagSpan roundIconTag = new RoundIconTagSpan(uoc.d, false, uoc.i, uoc.j, uoc.h, false, uoc.p, uoc.g, false, uoc.k, uoc.l, uoc.o, uoc.q, false, false, uoc.m, uoc.n, 0x6122, null);
          int i1 = str1.length() + i;
          int i2 = 17;
          obj.setSpan(v6, i, i1, i2);
          obj.setSpan(new a$d(uoc, str, str1), i, i1, i2);
       }
       return;
    }
}
