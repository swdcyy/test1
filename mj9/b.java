package mj9.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import xl8.b;
import mj9.b$a;
import erd.g;
import crd.b;
import hlb.d;
import java.lang.CharSequence;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import qrd.l1;
import k2b.u1;
import android.view.View;
import mj9.b$b;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Typeface;
import ekd.m1;
import java.lang.Integer;
import mj9.a$a;

public final class b extends PresenterV2	// class@00303f
{
    public Integer p;
    public d q;
    public b r;
    public a$a s;
    public TextView t;

    public void b(){
       super();
    }
    public static final TextView P8(b p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mTagNameView");
       }
       return p0;
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "9")) {
          return;
       }
       b tr = this.r;
       if (tr == null) {
          a.S("mCurrentTagPublisher");
       }
       this.X7(tr.b().subscribe(new b$a(this)));
       tr = this.t;
       if (tr == null) {
          a.S("mTagNameView");
       }
       b tq = this.q;
       String str = "mHotChannelSubTag";
       if (tq == null) {
          a.S(str);
       }
       tr.setText(tq.mTitle);
       this.S8();
       if (!PatchProxy.applyVoid(objArray, this, uob, "11")) {
          uob = this.q;
          if (uob == null) {
             a.S(str);
          }
          if (uob.a == null) {
             uob = this.q;
             if (uob == null) {
                a.S(str);
             }
             uob.a = true;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SUB_CHANNEL_BUTTON";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$TagShowPackage tagShowPacka = new ClientContent$TagShowPackage();
             ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[true];
             tagPackageAr[0] = this.R8();
             tagShowPacka.tagPackage = tagPackageAr;
             uContentPack.tagShowPackage = tagShowPacka;
             u1.u0(3, uElementPack, uContentPack);
          }
       }
       this.m8().setOnClickListener(new b$b(this));
       return;
    }
    public final ClientContent$TagPackage R8(){
       ClientContent$TagPackage obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$TagPackage();
       b tq = this.q;
       if (tq == null) {
          a.S("mHotChannelSubTag");
       }
       obj.identity = String.valueOf(tq.mSubChannelId);
       tq = this.q;
       if (tq == null) {
          a.S("mHotChannelSubTag");
       }
       obj.name = tq.mTitle;
       tq = this.q;
       if (tq == null) {
          a.S("mHotChannelSubTag");
       }
       obj.index = (long)tq.b;
       return obj;
    }
    public final void S8(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       b tr = this.r;
       if (tr == null) {
          a.S("mCurrentTagPublisher");
       }
       d uod = tr.a();
       if (uod != null) {
          b tt = this.t;
          String str = "mTagNameView";
          if (tt == null) {
             a.S(str);
          }
          b tq = this.q;
          if (tq == null) {
             a.S("mHotChannelSubTag");
          }
          int i = 1;
          b = (!tq.mSubChannelId - uod.mSubChannelId)? true: false;
          tt.setSelected(b);
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          tq = this.t;
          if (tq == null) {
             a.S(str);
          }
          Typeface typeface = (tq.isSelected())? Typeface.defaultFromStyle(i): Typeface.defaultFromStyle(0);
          tt.setTypeface(typeface);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       p0 = m1.f(p0, R.id.sub_tag_name);
       a.o(p0, "ViewBindUtils.bindWidget¡­tView, R.id.sub_tag_name\)");
       this.t = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("ADAPTER_POSITION");
       Object obj = this.q8(d.class);
       a.o(obj, "inject\(HotChannelSubTag::class.java\)");
       this.q = obj;
       obj = this.r8("HOT_CHANNEL_CURRENT_TAG");
       a.o(obj, "inject\(HotChannelAccessI¡­.HOT_CHANNEL_CURRENT_TAG\)");
       this.r = obj;
       obj = this.r8("HOT_CHANNEL_SELECT_TAG_LISTENER");
       a.o(obj, "inject\(HotChannelAccessI¡­NNEL_SELECT_TAG_LISTENER\)");
       this.s = obj;
       return;
    }
}
