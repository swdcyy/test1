package com.yxcorp.gifshow.relation.intimate.dialog.o;
import erd.o;
import com.yxcorp.gifshow.relation.intimate.dialog.p;
import java.lang.Object;
import com.yxcorp.gifshow.relation.intimate.model.IntimatePostMediaSceneInfoResponse;
import java.util.Objects;
import v9c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.google.gson.JsonElement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import y36.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import abc.u;
import brd.t;
import java.lang.IllegalArgumentException;
import java.lang.Boolean;

public final class o implements o	// class@0018fa
{
    public final p b;

    public void o(p p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().w("IntimateRelationSuccessDialog", "launchPostMediaScene: response result is "+p0.mResult, objArray);
       if (p0.mResult == true) {
          IntimatePostMediaSceneInfoResponse mPostParams = p0.mPostParams;
          if (mPostParams != null) {
             String str = mPostParams.toString();
             if (!TextUtils.x(str)) {
                Object[] objArray1 = new Object[i];
                a.C().w("IntimateRelationSuccessDialog", "launchMediaScenePage: mediaSceneInitParams="+str, objArray1);
                p0 = y6.s(b.class, LoadPolicy.SILENT).w(new u(tb, p0));
             label_0073 :
                return p0;
             }else {
                throw new IllegalArgumentException("IntimateRelationSuccessDialoglaunchPostMediaScene: mediaSceneParams is empty.");
             }
          }
       }
       p0 = t.just(Boolean.FALSE);
       goto label_0073 ;
    }
}
