package com.yxcorp.gifshow.album.viewbinder.AbsAlbumHeaderItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class AbsAlbumHeaderItemViewBinder extends AbsAlbumItemViewBinder	// class@001acd
{
    public TextView e;
    public ViewGroup f;

    public void AbsAlbumHeaderItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public final ViewGroup n(){
       return this.f;
    }
    public final TextView o(){
       return this.e;
    }
    public final void p(TextView p0){
       this.e = p0;
    }
}
