package cn.bipt.experiment;

public class StringPoem {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();//动态字符串数组

		builder.append("汉皇重色思倾国御宇多年求不得"
        		+ "杨家有女初长成养在深闺人未识"
        		+ "天生丽质难自弃一朝选在君王侧"
        		+ "回眸一笑百媚生六宫粉黛无颜色"
        		+ "春寒赐浴华清池温泉水滑洗凝脂"
        		+ "侍儿扶起娇无力始是新承恩泽时"
        		+ "云鬓花颜金步摇芙蓉帐暖度春宵"
        		+ "春宵苦短日高起从此君王不早朝"
        		+ "承欢侍宴无闲暇春从春游夜专夜"
        		+ "后宫佳丽三千人三千宠爱在一身"
        		+ "金屋妆成娇侍夜玉楼宴罢醉和春"
        		+ "姊妹弟兄皆列士可怜光采生门户"
        		+ "遂令天下父母心不重生男重生女"
        		+ "骊宫高处入青云仙乐风飘处处闻"
        		+ "缓歌慢舞凝丝竹尽日君王看不足"
        		+ "渔阳鼙鼓动地来惊破霓裳羽衣曲"
        		+ "九重城阙烟尘生千乘万骑西南行");//向builder添加内容
	String str2 = "";
	try{	
		for(int i=0;i<builder.length();i++){
			if(i*7+7>builder.length()){//每7个为一组
				str2 +=builder.substring(i*7, builder.length());//截取i*7个字符
				break;
    }
		if((i*7)%2==0){//判断i*7奇数时加",",偶数时加"。"
			str2 += builder.substring(i*7, i*7+7)+",";
    }	else{
    	str2 += builder.substring(i*7, i*7+7)+"."+"\n";
    }
   }
		System.out.println(new StringBuilder(str2).toString());//字符串形式输出加入标点后的古诗
		String find = "杨";//查找古诗中"杨"
		int count = count(builder, find);//调用count方法，在古诗中统计“杨”出现的次数
		System.out.println("本诗中  "+find +  " 出现的次数:"+ count+"次");
	}catch(Exception e){
	   System.out.println("捕获异常"+e.toString());//抛出异常
	   e.printStackTrace();
  }
  }
	

  public static int count(StringBuilder str, String findStr) {
	   int count = 0;//初始化0
	   int index = 0;
	   while ((index = str.indexOf(findStr, index)) != -1) {//在字符串中搜索字符，返回字符从左起首次出现的位置，若没有出现，返回-1
	    index = index + findStr.length();
	    count++;
	   }
	   return count;
	  }
	 
	}










