package com.google.protobuf.Internal$ListAdapter;
import java.util.AbstractList;
import java.util.List;
import com.google.protobuf.Internal$ListAdapter$Converter;
import java.lang.Object;

public class Internal$ListAdapter extends AbstractList	// class@00044e
{
    public final Internal$ListAdapter$Converter converter;
    public final List fromList;

    public void Internal$ListAdapter(List p0,Internal$ListAdapter$Converter p1){
       super();
       this.fromList = p0;
       this.converter = p1;
    }
    public Object get(int p0){
       return this.converter.convert(this.fromList.get(p0));
    }
    public int size(){
       return this.fromList.size();
    }
}
