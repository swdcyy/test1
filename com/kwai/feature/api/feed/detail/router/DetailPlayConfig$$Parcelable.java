package com.kwai.feature.api.feed.detail.router.DetailPlayConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig$$Parcelable$a;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.player.gotham.impl.KwaiSessionKeyGenerator;
import com.kwai.framework.player.gotham.impl.KwaiSessionKeyGenerator$$Parcelable;
import java.util.HashSet;
import java.lang.Integer;
import java.util.Set;
import java.util.Iterator;

public class DetailPlayConfig$$Parcelable implements Parcelable, d	// class@000e9e
{
    public DetailPlayConfig detailPlayConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       DetailPlayConfig$$Parcelable.CREATOR = new DetailPlayConfig$$Parcelable$a();
    }
    public void DetailPlayConfig$$Parcelable(DetailPlayConfig p0){
       super();
       this.detailPlayConfig$$0 = p0;
    }
    public static DetailPlayConfig read(Parcel p0,a p1){
       int[] ointArray;
       int i1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          DetailPlayConfig uDetailPlayC = new DetailPlayConfig();
          p1.f(p1.g(), uDetailPlayC);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uDetailPlayC.mUseHardDecoder = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uDetailPlayC.mUsePlayerKit = b1;
          DetailPlayConfig uDetailPlayC1 = DetailPlayConfig.class;
          boolean b2 = (p0.readInt() == 1)? true: false;
          a.d(uDetailPlayC1, uDetailPlayC, "mSessionKeyGeneratorSharedIn", Boolean.valueOf(b2));
          uDetailPlayC.mShareControllerBundleId = p0.readInt();
          b1 = p0.readInt();
          Set set = null;
          if (b1 < 0) {
             ointArray = set;
          }else {
             ointArray = new int[b1];
             for (i1 = 0; i1 < b1; i1 = i1 + 1) {
                ointArray[i1] = p0.readInt();
             }
          }
          uDetailPlayC.mShareSupportFeedType = ointArray;
          b1 = (p0.readInt() == 1)? true: false;
          uDetailPlayC.mEnableSyncSharedPlayerStatus = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uDetailPlayC.mSupportPlayInBackground = b1;
          a.d(DetailPlayConfig.class, uDetailPlayC, "mKeyGenerator", KwaiSessionKeyGenerator$$Parcelable.read(p0, p1));
          b1 = (p0.readInt() == 1)? true: false;
          uDetailPlayC.mUseSurfaceView = b1;
          uDetailPlayC.mPlayerSessionUuid = p0.readString();
          uDetailPlayC.mContinuePlayStrategy = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uDetailPlayC.mContinuePlayWhileExit = b1;
          uDetailPlayC.mSavePlayProgressStrategy = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uDetailPlayC.mUseSWDecoder = b1;
          b1 = p0.readInt();
          if (b1 >= 0) {
             HashSet hashSet = new HashSet(b1);
             for (i1 = 0; i1 < b1; i1 = i1 + 1) {
                Set set1 = (p0.readInt() < 0)? set: Integer.valueOf(p0.readInt());
                hashSet.add(set1);
             }
             set = hashSet;
          }
          uDetailPlayC.mInitPauseFlags = set;
          if (p0.readInt() == 1) {
             b = true;
          }
          uDetailPlayC.mSharePlayer = b;
          p1.f(i, uDetailPlayC);
          return uDetailPlayC;
       }
    }
    public static void write(DetailPlayConfig p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mUseHardDecoder);
          p1.writeInt(p0.mUsePlayerKit);
          p1.writeInt(a.b(Boolean.TYPE, DetailPlayConfig.class, p0, "mSessionKeyGeneratorSharedIn").booleanValue());
          p1.writeInt(p0.mShareControllerBundleId);
          DetailPlayConfig mShareSuppor = p0.mShareSupportFeedType;
          if (mShareSuppor == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mShareSuppor.length);
             mShareSuppor = p0.mShareSupportFeedType;
             int len = mShareSuppor.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                p1.writeInt(mShareSuppor[i1]);
             }
          }
          p1.writeInt(p0.mEnableSyncSharedPlayerStatus);
          p1.writeInt(p0.mSupportPlayInBackground);
          KwaiSessionKeyGenerator$$Parcelable.write(a.b(KwaiSessionKeyGenerator.class, DetailPlayConfig.class, p0, "mKeyGenerator"), p1, p2, p3);
          p1.writeInt(p0.mUseSurfaceView);
          p1.writeString(p0.mPlayerSessionUuid);
          p1.writeInt(p0.mContinuePlayStrategy);
          p1.writeInt(p0.mContinuePlayWhileExit);
          p1.writeInt(p0.mSavePlayProgressStrategy);
          p1.writeInt(p0.mUseSWDecoder);
          DetailPlayConfig mInitPauseFl = p0.mInitPauseFlags;
          if (mInitPauseFl == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mInitPauseFl.size());
             Iterator iterator = p0.mInitPauseFlags.iterator();
             while (iterator.hasNext()) {
                Integer integer = iterator.next();
                if (integer == null) {
                   p1.writeInt(-1);
                }else {
                   p1.writeInt(1);
                   p1.writeInt(integer.intValue());
                }
             }
          }
          p1.writeInt(p0.mSharePlayer);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public DetailPlayConfig getParcel(){
       return this.detailPlayConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       DetailPlayConfig$$Parcelable.write(this.detailPlayConfig$$0, p0, p1, new a());
    }
}
