package com.yxcorp.gifshow.v3.editor.item.EditIcon;
import com.yxcorp.gifshow.v3.editor.item.PostBaseIcon;
import ooc.g;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;

public class EditIcon extends PostBaseIcon	// class@000fb0
{
    public EditorDelegate mEditorDelegate;
    public static final long serialVersionUID = 0xe2297e51dabb0b6a;

    public void EditIcon(g p0,int p1,int p2){
       super(p0, p1, p2);
    }
    public EditorDelegate getEditorDelegate(){
       return this.mEditorDelegate;
    }
    public PostBaseIcon setEditorDelegate(EditorDelegate p0){
       this.mEditorDelegate = p0;
       return this;
    }
}
