package c1c.d;
import c1c.a;
import c1c.d$a;
import nsd.u;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$f;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import b1c.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import b1c.a$b;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Boolean;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import b1c.b;
import b1c.a$c;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;
import b1c.a$d;

public final class d extends a	// class@0004ee
{
    public int j;
    public MakeupSuite k;
    public static final d$a l;

    static {
       d.l = new d$a(null);
    }
    public void d(l p0){
       a.p(p0, "callback");
       super(p0);
       this.j = a0$f.c.a();
    }
    public int e(){
       return this.j;
    }
    public void g(a p0){
       StringBuilder str2;
       FilterConfig uFilterConfi;
       Object[] objArray;
       b uob1;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "1")) {
          return;
       }
       a.p(p0, "filterProviderAction");
       boolean b = true;
       String str = "EffectBus-Filter_Makeup";
       String str1 = null;
       if (p0 instanceof a$b) {
          a$b uob = p0.a();
          boolean b1 = p0.b();
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(uob, Boolean.valueOf(b1), this, uod, "2")) {
             if (uob == null && !FilterConfig.isEmptyOrNull(this.b())) {
                b1 = a.D();
                str2 = "�յ�����ħ���¼�����ħ����Чǰʹ�ù���ױ"+"�����ǰ��ױ���˾�״̬ ";
                uFilterConfi = this.b();
                if (uFilterConfi != null) {
                   str1 = uFilterConfi.toSimpleString();
                }
                objArray = new Object[0];
                b1.w(str, str2+str1, objArray);
                this.m(b);
                uob1 = new b();
                uob1.e(this.b());
                uob1.h(a0$f.c);
                this.k(uob1);
             }else if(uob != null && (uob.isKeepCurrentFilter() == b && (!b1 && !FilterConfig.isEmptyOrNull(this.b())))){
                b1 = a.D();
                str2 = "ħ��Ϊʹ�õ�ǰ�˾�ħ��, ��Ӱ�쵱ǰ��ױ���˾���״̬, "+"����Ҫά�ֳ���ǰ��ױ���˾� ";
                uFilterConfi = this.b();
                if (uFilterConfi != null) {
                   str1 = uFilterConfi.toSimpleString();
                }
                objArray = new Object[0];
                b1.w(str, str2+str1, objArray);
                this.m(b);
                uob1 = new b();
                uob1.e(this.b());
                uob1.h(a0$f.c);
                this.k(uob1);
             }else {
                this.k(str1);
             }
          }
       }else if(p0 instanceof a$c){
          a$c b2 = p0.b;
          FilterConfig uFilterConfi1 = p0.a();
          a uoa = a.D();
          StringBuilder str3 = "��ױ���� ";
          SimpleMagicFace mName = (b2 != null)? b2.mName: str1;
          str3 = str3+mName+", "+"��ױ�����˾���";
          String str4 = (uFilterConfi1 != null)? uFilterConfi1.toSimpleString(): str1;
          Object[] objArray1 = new Object[0];
          uoa.w(str, str3+str4, objArray1);
          if (!n.l(uFilterConfi1)) {
             uoa = a.D();
             str3 = "��ױ�����˾������� ";
             String str5 = (uFilterConfi1 != null)? uFilterConfi1.toSimpleString(): str1;
             Object[] objArray2 = new Object[0];
             uoa.w(str, str3+str5, objArray2);
             uFilterConfi1 = FilterConfig.getEmpty();
          }
          if (!PatchProxy.applyVoidTwoRefs(b2, uFilterConfi1, this, uod, "3")) {
             this.h(uFilterConfi1);
             this.k = b2;
             this.a(uFilterConfi1);
             if (!FilterConfig.isEmptyOrNull(uFilterConfi1)) {
                this.m(b);
                b uob2 = new b();
                uob2.e(uFilterConfi1);
                uob2.h(a0$f.c);
                this.k(uob2);
             }else if(FilterConfig.isEmptyOrNull(uFilterConfi1)){
                this.m(0);
                this.k(str1);
             }else {
                this.k(str1);
             }
          }
       }else if(p0 instanceof a$d){
          objArray = new Object[0];
          a.D().w(str, "��ױ��Ӧ�û����룬������ױ״̬", objArray);
          if (!PatchProxy.applyVoid(str1, this, uod, "4")) {
             this.j(FilterConfig.getEmpty());
             this.m(0);
             this.k(str1);
          }
       }else {
          Object[] objArray3 = new Object[0];
          a.D().w(str, "��ױ����Ӧ�ⲿ�����˾��¼�", objArray3);
       }
       return;
    }
    public void l(int p0){
       this.j = p0;
    }
}
