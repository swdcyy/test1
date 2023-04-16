package com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar$SavedState;
import androidx.customview.view.AbsSavedState;
import com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class BaseRoundCornerProgressBar$SavedState extends AbsSavedState	// class@001677
{
    public float d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int[] l;
    public int[] m;
    public boolean n;
    public static final Parcelable$ClassLoaderCreator CREATOR;

    static {
       BaseRoundCornerProgressBar$SavedState.CREATOR = new BaseRoundCornerProgressBar$SavedState$a();
    }
    public void BaseRoundCornerProgressBar$SavedState(Parcel p0){
       super(p0, null);
    }
    public void BaseRoundCornerProgressBar$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.d = p0.readFloat();
       this.e = p0.readFloat();
       this.f = p0.readFloat();
       this.g = p0.readInt();
       this.h = p0.readInt();
       this.i = p0.readInt();
       this.j = p0.readInt();
       this.k = p0.readInt();
       int[] ointArray = new int[p0.readInt()];
       this.l = ointArray;
       p0.readIntArray(ointArray);
       ointArray = new int[p0.readInt()];
       this.m = ointArray;
       p0.readIntArray(ointArray);
       boolean b = (p0.readByte())? true: false;
       this.n = b;
       return;
    }
    public void BaseRoundCornerProgressBar$SavedState(Parcelable p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       int[] ointArray;
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar$SavedState.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, BaseRoundCornerProgressBar$SavedState.class, "1")) {
          return;
       }
       super.writeToParcel(p0, p1);
       p0.writeFloat(this.d);
       p0.writeFloat(this.e);
       p0.writeFloat(this.f);
       p0.writeInt(this.g);
       p0.writeInt(this.h);
       p0.writeInt(this.i);
       p0.writeInt(this.j);
       p0.writeInt(this.k);
       BaseRoundCornerProgressBar$SavedState tl = this.l;
       tl = (tl != null)? tl.length: 0;
       p0.writeInt(tl);
       tl = this.l;
       if (tl == null) {
          ointArray = new int[0];
       }
       p0.writeIntArray(tl);
       tl = this.m;
       tl = (tl != null)? tl.length: 0;
       p0.writeInt(tl);
       tl = this.m;
       if (tl == null) {
          ointArray = new int[0];
       }
       p0.writeIntArray(tl);
       p0.writeByte((byte)this.n);
       return;
    }
}
