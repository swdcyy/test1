package com.yxcorp.gifshow.v3.editor.text.subtitle.g;
import erd.o;
import java.lang.Object;
import njd.a;
import faa.a;
import java.lang.String;
import q87.c;
import uv8.m;
import uv8.n;
import evc.a;
import brd.t;
import dvc.j;
import com.yxcorp.gifshow.v3.editor.text.subtitle.j;
import erd.r;

public final class g implements o	// class@00149a
{
    public final long b;

    public void g(long p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       Object[] objArray = new Object[0];
       a.D().s("SubtitleAudioAssetUploadHelper", "audio upload res", objArray);
       return n.a().b(p0.a().a()).repeatWhen(new j(this.b)).takeUntil(j.b);
    }
}
