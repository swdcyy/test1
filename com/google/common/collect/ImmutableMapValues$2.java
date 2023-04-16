package com.google.common.collect.ImmutableMapValues$2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMapValues;
import java.lang.Object;
import java.util.List;
import java.util.Map$Entry;
import java.util.AbstractCollection;

public class ImmutableMapValues$2 extends ImmutableList	// class@0017e8
{
    public final ImmutableMapValues this$0;
    public final ImmutableList val$entryList;

    public void ImmutableMapValues$2(ImmutableMapValues p0,ImmutableList p1){
       this.this$0 = p0;
       this.val$entryList = p1;
       super();
    }
    public Object get(int p0){
       return this.val$entryList.get(p0).getValue();
    }
    public boolean isPartialView(){
       return true;
    }
    public int size(){
       return this.val$entryList.size();
    }
}
