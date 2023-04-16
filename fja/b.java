package fja.b;
import nl8.a;
import fja.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o0b.a;
import y0b.h;
import y0b.n;
import y0b.s;
import java.lang.Long;
import a7c.h;
import com.kwai.framework.model.user.QCurrentUser;
import android.widget.TextView;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import io.reactivex.subjects.PublishSubject;
import qvb.n0;
import qvb.a;
import com.yxcorp.gifshow.pymk.f;
import qvb.q;
import com.yxcorp.gifshow.pymk.b;
import fja.b$b;
import android.view.View$OnClickListener;
import fja.b$c;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import android.text.TextPaint;
import ekd.m1;
import android.content.Context;
import androidx.fragment.app.Fragment;
import ekd.r0;
import y0b.j;
import java.util.List;
import y0b.i;
import com.yxcorp.gifshow.listcomponent.layoutmanager.a;
import w0b.g;
import java.lang.Comparable;
import java.lang.Integer;
import java.util.ArrayList;
import com.kwai.framework.model.user.RecoUser;
import fja.a;
import java.lang.Runnable;
import z6c.b;
import f7c.d;
import e17.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b extends a	// class@00294c
{
    public View A;
    public h B;
    public RecyclerFragment C;
    public boolean D;
    public final q E;
    public TextView u;
    public View v;
    public View w;
    public View x;
    public View y;
    public TextView z;

    public void b(){
       super();
       this.D = false;
       this.E = new b$a(this);
    }
    public void E8(){
       View[] viewArray;
       String str;
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.B = this.V8().a(Long.valueOf(this.W8().f().G().g()), "PymkParams", h.class);
       b tu = this.u;
       int i = (QCurrentUser.ME.isLogined())? 0x7f1041bf: 0x7f104b45;
       tu.setText(i);
       i = 3;
       if (this.C.q().isEmpty()) {
          viewArray = new View[i];
          viewArray[0] = this.x;
          viewArray[1] = this.y;
          viewArray[2] = this.z;
          n.Z(8, viewArray);
          viewArray = new View[]{this.u};
          n.Z(0, viewArray);
          int i1 = (FollowFilterHelper.i())? 0: 8;
          View[] viewArray1 = new View[]{this.A};
          n.Z(i1, viewArray1);
          tu = this.u;
          str = (FollowFilterHelper.i())? a1.p(R.string.arg_RES_7f100fce): a1.p(R.string.arg_RES_7f1041bf);
          tu.setText(str);
       }else if(FollowConfigUtil.a()){
          viewArray = new View[i];
          viewArray[0] = this.x;
          viewArray[1] = this.y;
          viewArray[2] = this.z;
          n.Z(8, viewArray);
          viewArray = new View[]{this.u,this.A};
          n.Z(8, viewArray);
       }else {
          viewArray = new View[i];
          viewArray[0] = this.x;
          viewArray[1] = this.y;
          viewArray[2] = this.z;
          n.Z(0, viewArray);
          viewArray = new View[]{this.u,this.A};
          n.Z(8, viewArray);
          tu = this.z;
          str = (FollowFilterHelper.i())? a1.p(R.string.arg_RES_7f100fcd): a1.p(R.string.arg_RES_7f10409a);
          tu.setText(str);
       }
       tu = this.B;
       if (tu != null && (tu.n() != null && this.W8().f().I().isEmpty())) {
          this.B.s().h(this.E);
          if (b.a()) {
             this.v.setVisibility(8);
             this.w.setVisibility(0);
             this.w.setOnClickListener(new b$b(this));
          }else {
             this.w.setVisibility(8);
             this.v.setVisibility(0);
             this.v.setOnClickListener(new b$c(this));
          }
          if (this.D == null) {
             PymkLogSender.pymkCloseBtnShow(this.B.s().l2());
             this.D = true;
          }
       }else {
          viewArray = new View[]{this.v,this.w};
          n.Z(8, viewArray);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.u.getPaint().setFakeBoldText(true);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.B.s().f(this.E);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a3f2c);
       this.v = m1.f(p0, 0x7f0a079a);
       this.w = m1.f(p0, 0x7f0a0795);
       this.x = m1.f(p0, 0x7f0a172a);
       this.y = m1.f(p0, 0x7f0a365b);
       this.z = m1.f(p0, 0x7f0a3f20);
       this.A = m1.f(p0, 0x7f0a0df1);
       return;
    }
    public void e(){
       int i;
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       if (r0.d(this.C.getContext())) {
          j oj = this.W8().k();
          List list = oj.w();
          i = oj.x().G().n().c().intValue();
          ArrayList uArrayList = new ArrayList();
          int i1 = 0;
          int i2 = -1;
          while (i1 < list.size()) {
             if (list.get(i1).mViewType != 11) {
                if (i2 == -1) {
                   i2 = i1;
                }
                uArrayList.add(list.get(i1));
             }
             i1 = i1 + 1;
          }
          b.a(this.C, (i + i2), new a(oj, uArrayList));
          this.B.u().Gb();
          PymkLogSender.pymkCloseBtnClick(this.B.s().l2());
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.C = this.r8("FRAGMENT");
       return;
    }
}
