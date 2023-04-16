package com.kwai.live.gzone.accompanyplay.anchor.r;
import y8c.g;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment;
import java.util.ArrayList;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.anchor.r$a;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ml8.c;
import h37.p;
import h37.r;
import h37.q;
import com.kwai.live.gzone.accompanyplay.anchor.s;
import h37.o0;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class r extends g	// class@000b30
{
    public LiveGzoneAccompanyFleetInfo w;
    public LiveGzoneAnchorAccompanyFleetStateFragment x;
    public ArrayList y;

    public void r(LiveGzoneAnchorAccompanyFleetStateFragment p0){
       super();
       this.y = new ArrayList();
       this.x = p0;
    }
    public ArrayList a1(int p0,f p1){
       LiveGzoneAnchorAccompanyFleetStateFragment obj;
       if (PatchProxy.isSupport(r.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, r.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.x.J;
       if (obj != null && !this.y.contains(obj)) {
          this.y.add(this.x.J);
       }
       return this.y;
    }
    public int f0(int p0){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, or, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.N0(p0) == null) {
          return 257;
       }else {
          return 256;
       }
    }
    public void g1(f p0,int p1,List p2){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, r.class, "2")) {
          return;
       }
       super.g1(p0, p1, p2);
       if (p0 instanceof r$a) {
          p1++;
          p0.f.setText(String.valueOf(p1));
       }
       return;
    }
    public int getItemCount(){
       r obj = PatchProxy.apply(null, this, r.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.w;
       int i = 0;
       if (obj == null) {
          return i;
       }
       LiveGzoneAccompanyFleetInfo mAccompanySt = obj.mAccompanyStatus;
       if (mAccompanySt != 4 && mAccompanySt != 3) {
          return obj.mAllowedMaxUser;
       }
       LiveGzoneAccompanyFleetInfo mOnBoardMemb = obj.mOnBoardMembers;
       if (mOnBoardMemb != null) {
          i = mOnBoardMemb.size();
       }
       return i;
    }
    public f h1(ViewGroup p0,int p1){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, or, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 257) {
          return new r$a(a.i(p0, 0x7f0d0b77), new PresenterV2());
       }else {
          View view = a.i(p0, R.layout.arg_RES_7f0d0b78);
          PresenterV2 presenterV2 = new PresenterV2();
          presenterV2.U7(new p());
          or = this.w;
          if (or != null && or.mEnableOneClick != null) {
             presenterV2.U7(new r());
          }else {
             presenterV2.U7(new q());
          }
          presenterV2.U7(new s());
          presenterV2.U7(new o0());
          return new f(view, presenterV2);
       }
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
}
