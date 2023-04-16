package com.yxcorp.gifshow.record.album.x1;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import k8c.d2;
import java.io.FileFilter;
import java.lang.Integer;

public final class x1 implements Callable	// class@001785
{
    public final Pattern b;

    public void x1(Pattern p0){
       this.b = p0;
    }
    public final Object call(){
       File[] uFileArray = LocalAlbumUtils.l().listFiles(new d2(this.b));
       int i = (uFileArray == null)? 0: uFileArray.length;
       return Integer.valueOf(i);
    }
}
