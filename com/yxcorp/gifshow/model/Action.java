package com.yxcorp.gifshow.model.Action;
import java.io.Serializable;
import android.os.Parcelable;
import com.yxcorp.gifshow.model.Action$a;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.ActionType;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Enum;

public class Action implements Serializable, Parcelable	// class@001dea
{
    public ActionType mActionType;
    public String mEcho;
    public String mUrl;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       Action.CREATOR = new Action$a();
    }
    public void Action(){
       super();
    }
    public void Action(Parcel p0){
       super();
       int i = p0.readInt();
       ActionType uActionType = (i == -1)? null: ActionType.values()[i];
       this.mActionType = uActionType;
       this.mUrl = p0.readString();
       this.mEcho = p0.readString();
       return;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(Action.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, Action.class, "1")) {
          return;
       }
       Action tmActionType = this.mActionType;
       tmActionType = (tmActionType == null)? -1: tmActionType.ordinal();
       p0.writeInt(tmActionType);
       p0.writeString(this.mUrl);
       p0.writeString(this.mEcho);
       return;
    }
}
