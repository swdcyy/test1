package com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData;

public final class NewVoteStickerDrawerData$b implements Parcelable$Creator	// class@000a71
{

    public void NewVoteStickerDrawerData$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewVoteStickerDrawerData$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       String str = p0.readString();
       String str1 = p0.readString();
       String str2 = p0.readString();
       String str3 = p0.readString();
       boolean b = false;
       int i = (p0.readInt())? 1: 0;
       if (p0.readInt()) {
          b = true;
       }
       NewVoteStickerDrawerData newVoteStick = new NewVoteStickerDrawerData(str, str1, str2, str3, i, b, p0.readInt());
       return obj;
    }
    public final Object[] newArray(int p0){
       NewVoteStickerDrawerData[] newVoteStick = new NewVoteStickerDrawerData[p0];
       return newVoteStick;
    }
}
