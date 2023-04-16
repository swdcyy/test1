package bwc.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.mixed.model.b;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.v3.mixed.model.MixVideoTrack;
import pb9.s0;
import pb9.b0;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import pb9.p;
import pb9.g;
import pb9.q;

public class a extends PresenterV2	// class@0004a3
{
    public MixImporterFragment p;
    public String q;
    public p r;

    public void a(MixImporterFragment p0){
       super();
       this.p = p0;
       this.q = p0.l;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       b uob = this.p.dh();
       ArrayList uArrayList = new ArrayList();
       double d = 0;
       for (int i = 0; i < uob.a.size(); i = i + 1) {
          MixVideoTrack mixVideoTrac = uob.a.get(i);
          s0 os0 = new s0();
          os0.a = mixVideoTrac.mPath;
          os0.b = mixVideoTrac.mType;
          os0.c = mixVideoTrac.mFullDuration;
          double d1 = mixVideoTrac.mClipStart + d;
          os0.d = d1;
          d1 = mixVideoTrac.mClipEnd + d;
          os0.e = d1;
          os0.f = i;
          uArrayList.add(os0);
          d = d + os0.c;
       }
       p op = p.e();
       this.r = op;
       op.j(new b0(this.q, Workspace$Type.VIDEO, Workspace$Source.IMPORT_MIXED, uArrayList), objArray);
       uob.f = this.r;
       uob.g = this.q;
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tr = this.r;
       if (tr != null) {
          tr.a();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tr = this.r;
       if (tr != null) {
          tr.i(this.q);
       }
       return;
    }
}
