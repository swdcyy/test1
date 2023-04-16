package com.smile.gifmaker.mvps.utils.SyncableProvider$a;
import xwd.c;
import java.lang.Object;
import android.os.Parcel;
import com.smile.gifmaker.mvps.utils.SyncableProvider;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import org.parceler.b;

public class SyncableProvider$a implements c	// class@000c31
{

    public void SyncableProvider$a(){
       super();
    }
    public Object a(Parcel p0){
       return this.c(p0);
    }
    public void b(Object p0,Parcel p1){
       this.d(p0, p1);
    }
    public SyncableProvider c(Parcel p0){
       return b.a(p0.readParcelable(SyncableProvider.class.getClassLoader()));
    }
    public void d(SyncableProvider p0,Parcel p1){
       p1.writeParcelable(b.b(p0.getClass(), p0), 0);
    }
}
