package com.google.common.collect.ImmutableMultiset$EntrySet;
import com.google.common.collect.ImmutableSet$Indexed;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableMultiset$a;
import java.lang.Object;
import com.google.common.collect.k$a;
import com.google.common.collect.k;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import java.util.AbstractCollection;

public final class ImmutableMultiset$EntrySet extends ImmutableSet$Indexed	// class@0017f3
{
    public final ImmutableMultiset this$0;
    public static final long serialVersionUID;

    public void ImmutableMultiset$EntrySet(ImmutableMultiset p0){
       this.this$0 = p0;
       super();
    }
    public void ImmutableMultiset$EntrySet(ImmutableMultiset p0,ImmutableMultiset$a p1){
       super(p0);
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (p0 instanceof k$a) {
          if (p0.getCount() <= 0) {
             return b;
          }else if(this.this$0.count(p0.getElement()) == p0.getCount()){
             b = true;
          }
       }
       return b;
    }
    public k$a get(int p0){
       return this.this$0.getEntry(p0);
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public int hashCode(){
       return this.this$0.hashCode();
    }
    public boolean isPartialView(){
       return this.this$0.isPartialView();
    }
    public int size(){
       return this.this$0.elementSet().size();
    }
}
