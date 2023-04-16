package com.kuaishou.android.model.mix.ShareToFollowModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.ShareToFollowModel$$Parcelable$a;
import com.kuaishou.android.model.mix.ShareToFollowModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class ShareToFollowModel$$Parcelable implements Parcelable, d	// class@000df9
{
    public ShareToFollowModel shareToFollowModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ShareToFollowModel$$Parcelable.CREATOR = new ShareToFollowModel$$Parcelable$a();
    }
    public void ShareToFollowModel$$Parcelable(ShareToFollowModel p0){
       super();
       this.shareToFollowModel$$0 = p0;
    }
    public static ShareToFollowModel read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ShareToFollowModel shareToFollo = new ShareToFollowModel();
          p1.f(p1.g(), shareToFollo);
          shareToFollo.mCount = p0.readInt();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(User$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          shareToFollo.mSharers = list;
          p1.f(i, shareToFollo);
          return shareToFollo;
       }
    }
    public static void write(ShareToFollowModel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mCount);
          ShareToFollowModel mSharers = p0.mSharers;
          if (mSharers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mSharers.size());
             Iterator iterator = p0.mSharers.iterator();
             while (iterator.hasNext()) {
                User$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ShareToFollowModel getParcel(){
       return this.shareToFollowModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ShareToFollowModel$$Parcelable.write(this.shareToFollowModel$$0, p0, p1, new a());
    }
}
