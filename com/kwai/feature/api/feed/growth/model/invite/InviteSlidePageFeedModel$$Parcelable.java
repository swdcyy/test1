package com.kwai.feature.api.feed.growth.model.invite.InviteSlidePageFeedModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.growth.model.invite.InviteSlidePageFeedModel$$Parcelable$a;
import com.kwai.feature.api.feed.growth.model.invite.InviteSlidePageFeedModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import java.io.Serializable;
import com.kwai.feature.api.feed.growth.model.invite.InviteCardMeta;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class InviteSlidePageFeedModel$$Parcelable implements Parcelable, d	// class@000edc
{
    public InviteSlidePageFeedModel inviteSlidePageFeedModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       InviteSlidePageFeedModel$$Parcelable.CREATOR = new InviteSlidePageFeedModel$$Parcelable$a();
    }
    public void InviteSlidePageFeedModel$$Parcelable(InviteSlidePageFeedModel p0){
       super();
       this.inviteSlidePageFeedModel$$0 = p0;
    }
    public static InviteSlidePageFeedModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          InviteSlidePageFeedModel inviteSlideP = new InviteSlidePageFeedModel();
          p1.f(p1.g(), inviteSlideP);
          inviteSlideP.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          inviteSlideP.mInviteCardMeta = p0.readSerializable();
          a.d(BaseFeed.class, inviteSlideP, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, inviteSlideP, "dataMap", new c().d(p0));
          p1.f(i, inviteSlideP);
          return inviteSlideP;
       }
    }
    public static void write(InviteSlidePageFeedModel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          p1.writeSerializable(p0.mInviteCardMeta);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public InviteSlidePageFeedModel getParcel(){
       return this.inviteSlidePageFeedModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       InviteSlidePageFeedModel$$Parcelable.write(this.inviteSlidePageFeedModel$$0, p0, p1, new a());
    }
}
