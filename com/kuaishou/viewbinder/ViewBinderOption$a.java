package com.kuaishou.viewbinder.ViewBinderOption$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import nsd.u;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.viewbinder.ViewBinderOption;
import kotlin.jvm.internal.a;

public final class ViewBinderOption$a implements Parcelable$Creator	// class@00119b
{

    public void ViewBinderOption$a(){
       super();
    }
    public void ViewBinderOption$a(u p0){
       super();
    }
    public Object createFromParcel(Parcel p0){
       ViewBinderOption viewBinderOp = PatchProxy.applyOneRefs(p0, this, ViewBinderOption$a.class, "1");
       if (viewBinderOp != PatchProxyResult.class) {
       }else {
          a.p(p0, "parcel");
          viewBinderOp = new ViewBinderOption(p0);
       }
       return viewBinderOp;
    }
    public Object[] newArray(int p0){
       ViewBinderOption[] viewBinderOp = new ViewBinderOption[p0];
       return viewBinderOp;
    }
}
