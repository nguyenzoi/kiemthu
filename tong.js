function tinh_tong(var n1 , var n2) {
    
	if(n1 < 0 ){
		n1 = Math.abs(n1) ;
	}
	if(n2 < 0){
		n2 = Math.abs(n2);
	}
	tong =  n1 + n2;
	return tong ;
}