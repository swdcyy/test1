package com.yxcorp.gifshow.camera.record.album.s;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent;
import java.lang.Class;
import brd.t;
import sb9.f0;
import lq.f;
import erd.g;
import crd.b;
import android.content.Intent;
import android.app.Activity;
import java.lang.String;
import java.io.Serializable;
import ekd.j0;
import java.util.ArrayList;

public class s	// class@001ccb
{
    public GifshowActivity a;
    public long b;
    public CountDownLatch c;
    public MultiplePhotosProject d;
    public ArrayList e;
    public boolean f;
    public b g;

    public void s(GifshowActivity p0){
       super();
       this.g = RxBus.f.f(MultiplePhotosWorkManager$CropPhotoWorkEvent.class).subscribe(new f0(this), f.b);
       this.a = p0;
       this.e = j0.e(p0.getIntent(), "album_selected_data");
    }
}
