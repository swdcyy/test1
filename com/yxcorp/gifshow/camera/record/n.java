package com.yxcorp.gifshow.camera.record.n;
import erd.o;
import qb9.z;
import android.os.Bundle;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.MagicFaceResponse;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.String;
import qb9.e0;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class n implements o	// class@001d5d
{
    public final z b;
    public final Bundle c;
    public final List d;
    public final QPhoto e;

    public void n(z p0,Bundle p1,List p2,QPhoto p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       n tb = this.b;
       n tc = this.c;
       n td = this.d;
       n te = this.e;
       if (!TextUtils.x(tb.f)) {
          int i = 0;
          SimpleMagicFace mId = (!q.f(p0.mMagicFaces))? p0.mMagicFaces.get(i).mId: null;
          if (!(tb.f).equals(mId)) {
             tb.f = null;
             tb.g = null;
             tc.remove("magicFaceId");
             tc.remove("childMagicFaceId");
             tc.remove("magic_face");
          }else {
             p0.mSelectedIndex = i;
          }
       }
       if (p0.mMagicFaces.size() < 20 && !q.f(td)) {
          y.y(td, new e0(p0));
       }
       tc.putString("uimode", tb.x);
       SerializableHook.putSerializable(tc, "magic_face_response", p0);
       return te;
    }
}
