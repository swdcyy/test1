package com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData;
import java.util.ArrayList;
import java.lang.ClassLoader;
import android.os.Parcelable;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;

public final class NewRelayStickerDrawerData$b implements Parcelable$Creator	// class@000a7c
{

    public void NewRelayStickerDrawerData$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewRelayStickerDrawerData$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       String str = p0.readString();
       long l = p0.readLong();
       int i = p0.readInt();
       ArrayList uArrayList = new ArrayList(i);
       for (; i; i = i - 1) {
          uArrayList.add(p0.readParcelable(NewRelayStickerDrawerData.class.getClassLoader()));
       }
       int i1 = (p0.readInt())? 1: 0;
       int i2 = (p0.readInt())? 1: 0;
       int i3 = (p0.readInt())? 1: 0;
       int i4 = p0.readInt();
       int i5 = (p0.readInt())? 1: 0;
       NewRelayStickerDrawerData newRelayStic = new NewRelayStickerDrawerData(str, l, uArrayList, i1, i2, i3, i4, i5, p0.readInt());
       return obj;
    }
    public final Object[] newArray(int p0){
       NewRelayStickerDrawerData[] newRelayStic = new NewRelayStickerDrawerData[p0];
       return newRelayStic;
    }
}
