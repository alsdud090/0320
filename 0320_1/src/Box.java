
public class Box {
	int width, lenth, height;
	
	Box(int w,int l, int h){
		width = w;
		lenth = l;
		height = h;
	}
	
	boolean isSameBox(Box obj){
		if((obj.width == width) & (obj.lenth == lenth) & (obj.height ==height))
			return true;
		else
			return false;
	}
}
