package com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig;
import android.os.Bundle;
import w69.o0;
import w69.c0;
import android.app.Activity;
import java.lang.String;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import ga9.c;
import java.util.List;
import android.content.Intent;
import com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig$LaunchType;

public interface abstract IAlbumMainFragment$IPreviewIntentConfig	// class@0019c3
{

    c0 a(Bundle p0,o0 p1);
    c0 b(Bundle p0);
    Intent c(Activity p0,String p1,int p2,String p3,int p4,int p5,AlbumLimitOption p6,c p7,List p8,List p9);
    IAlbumMainFragment$IPreviewIntentConfig$LaunchType getType();
}
