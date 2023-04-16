package com.google.common.collect.Tables$ImmutableCell;
import java.io.Serializable;
import com.google.common.collect.Tables$b;
import java.lang.Object;

public final class Tables$ImmutableCell extends Tables$b implements Serializable	// class@001893
{
    public final Object columnKey;
    public final Object rowKey;
    public final Object value;
    public static final long serialVersionUID;

    public void Tables$ImmutableCell(Object p0,Object p1,Object p2){
       super();
       this.rowKey = p0;
       this.columnKey = p1;
       this.value = p2;
    }
    public Object getColumnKey(){
       return this.columnKey;
    }
    public Object getRowKey(){
       return this.rowKey;
    }
    public Object getValue(){
       return this.value;
    }
}
