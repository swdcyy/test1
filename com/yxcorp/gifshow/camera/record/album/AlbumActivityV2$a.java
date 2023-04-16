package com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$a;
import com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2;
import java.lang.Object;
import android.os.Bundle;
import w69.o0;
import w69.c0;
import w69.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import x79.e;
import android.app.Activity;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import ga9.c;
import java.util.List;
import android.content.Intent;
import com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig$LaunchType;

public class AlbumActivityV2$a implements IAlbumMainFragment$IPreviewIntentConfig	// class@001c9d
{
    public final AlbumActivityV2 a;

    public void AlbumActivityV2$a(AlbumActivityV2 p0){
       this.a = p0;
       super();
    }
    public c0 a(Bundle p0,o0 p1){
       return a0.a(this, p0, p1);
    }
    public c0 b(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumActivityV2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.f().c(p0);
    }
    public Intent c(Activity p0,String p1,int p2,String p3,int p4,int p5,AlbumLimitOption p6,c p7,List p8,List p9){
       return a0.b(this, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }
    public IAlbumMainFragment$IPreviewIntentConfig$LaunchType getType(){
       return a0.c(this);
    }
}
