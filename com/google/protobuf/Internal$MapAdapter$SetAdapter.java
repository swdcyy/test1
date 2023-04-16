package com.google.protobuf.Internal$MapAdapter$SetAdapter;
import java.util.AbstractSet;
import com.google.protobuf.Internal$MapAdapter;
import java.util.Set;
import java.util.Iterator;
import com.google.protobuf.Internal$MapAdapter$IteratorAdapter;

public class Internal$MapAdapter$SetAdapter extends AbstractSet	// class@000454
{
    public final Set realSet;
    public final Internal$MapAdapter this$0;

    public void Internal$MapAdapter$SetAdapter(Internal$MapAdapter p0,Set p1){
       this.this$0 = p0;
       super();
       this.realSet = p1;
    }
    public Iterator iterator(){
       return new Internal$MapAdapter$IteratorAdapter(this.this$0, this.realSet.iterator());
    }
    public int size(){
       return this.realSet.size();
    }
}
