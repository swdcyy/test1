package com.yxcorp.gifshow.model.Action$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.Action;

public class Action$a implements Parcelable$Creator	// class@001de9
{

    public void Action$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       Action uAction = PatchProxy.applyOneRefs(p0, this, Action$a.class, "1");
       if (uAction != PatchProxyResult.class) {
       }else {
          uAction = new Action(p0);
       }
       return uAction;
    }
    public Object[] newArray(int p0){
       Action[] uActionArray = new Action[p0];
       return uActionArray;
    }
}
