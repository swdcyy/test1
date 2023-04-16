package com.yxcorp.gifshow.music.cloudmusic.common.viewbinder.AbsSearchMusicItemViewBinder;
import xob.d;
import xob.c;
import xob.e;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.c;
import android.view.ViewGroup;

public abstract class AbsSearchMusicItemViewBinder extends BaseViewBinder implements d, c, e	// class@00200e
{
    public ViewGroup e;
    public ViewGroup f;
    public ViewGroup g;
    public ViewGroup h;
    public KwaiImageView i;
    public KwaiImageView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public View p;
    public TextView q;
    public LinearLayout r;
    public LinearLayout s;
    public SpectrumView t;
    public PlayBackView u;
    public ConstraintLayout v;
    public View w;
    public LinearLayout x;
    public View y;
    public final int z;

    public void AbsSearchMusicItemViewBinder(c p0,int p1){
       super(p0);
       this.z = p1;
    }
    public final ViewGroup y(){
       return this.e;
    }
    public final ViewGroup z(){
       return this.f;
    }
}
