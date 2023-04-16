package com.yxcorp.gifshow.edit.draft.model.DraftFileManager$d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class DraftFileManager$d	// class@001aec
{
    public final c a;
    public AtomicLong b;
    public final ConcurrentMap c;
    public final CopyOnWriteArrayList d;

    public void DraftFileManager$d(c p0,long p1){
       super();
       this.b = new AtomicLong();
       this.c = new ConcurrentHashMap();
       this.d = new CopyOnWriteArrayList();
       this.a = p0;
       this.b.set(p1);
    }
}
