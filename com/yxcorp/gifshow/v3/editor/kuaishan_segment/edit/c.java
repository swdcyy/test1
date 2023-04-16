package com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.c;
import erd.o;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.KuaishanSegmentVideoEditFragment;
import java.lang.Integer;
import brd.t;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.String;

public final class c implements o	// class@00101e
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       if (!p0.booleanValue()) {
          return t.just(Integer.valueOf(0));
       }
       throw new KSException(-39, "startProcess\(\) illegal info detected");
    }
}
