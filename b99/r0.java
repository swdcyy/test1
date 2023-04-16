package b99.r0;
import erd.g;
import b99.t0;
import java.lang.Object;
import u3a.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.PhotoMeta;
import psb.c;
import psb.a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import brd.t;
import cjd.e;
import erd.o;
import b99.q0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class r0 implements g	// class@0003b7
{
    public final t0 b;

    public void r0(t0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r0 tb = this.b;
       Objects.requireNonNull(tb);
       t0 ot0 = t0.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, ot0, "23")) {
       }else if(!TextUtils.n(p0.a, tb.w.getPhotoId()) || (PatchProxy.applyVoid(null, tb, ot0, "6") || tb.r.mPlcEntryStyleInfo == null)){
          PhotoMeta mPlcEntrySty = tb.r.mPlcEntryStyleInfo;
          tb.X7(a.a().b(tb.w.getPhotoId(), mPlcEntrySty.mBizType, mPlcEntrySty.showPageType, TextUtils.k(mPlcEntrySty.photoPage)).map(new e()).subscribe(new q0(tb)));
       }
       return;
    }
}
