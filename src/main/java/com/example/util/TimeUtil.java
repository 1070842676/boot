package com.example.util;


import org.apache.commons.lang.StringUtils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


/**
 * User: Administrator Date: 13-12-8 Time: 下午8:07
 */
public class TimeUtil {

    private static final ThreadLocal<SimpleDateFormat> SDF_DATE=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("yyyy-MM-dd");
		}

	};

	private static final ThreadLocal<SimpleDateFormat> SDF_DATE_MONTH=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("yyyy-MM");
		}

	};

    private static final ThreadLocal<SimpleDateFormat> SDF_DATETIME=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}

	};

    private static final ThreadLocal<SimpleDateFormat> SDF_WEEK_DATETIME=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E")    ;
		}

	};
    private static final ThreadLocal<SimpleDateFormat> SDF_TIME=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("HH:mm:ss");
		}

	};
    private static final ThreadLocal<SimpleDateFormat> SDF_DATE_=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return  new SimpleDateFormat("yyyyMMdd");
		}

	};
    private static final ThreadLocal<SimpleDateFormat> SDF_DATE_MIN=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("yyMMdd");
		}

	};
    private static final ThreadLocal<SimpleDateFormat> SDF_M_D_H_M=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return  new SimpleDateFormat("MMddHHmmS");
		}

	};
    private static final ThreadLocal<SimpleDateFormat> SDF_YYYYMM=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("yyyyMM");
		}

	};
    private static final ThreadLocal<SimpleDateFormat> SDF_TIME_NO_POINT=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("HHmmss");
		}

	};
    private static final ThreadLocal<SimpleDateFormat> SDF_TIME_MIN=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("HHmm");
		}

	};
    private static final ThreadLocal<SimpleDateFormat> SDF_DATE_MIN_SHORT=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("MM-dd HH:mm");
		}

	};
    private static final ThreadLocal<SimpleDateFormat> SDF_HTBX_DATETIME=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		}

	};

    private static final ThreadLocal<SimpleDateFormat> SDF_DATETIME_yyyyMMddHHmmss=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("yyyyMMddHHmmss");
		}

	};

    private static final ThreadLocal<SimpleDateFormat> SDF_DATE_YEAR=new ThreadLocal<SimpleDateFormat>(){
        @Override
	    protected SimpleDateFormat initialValue(){
			return new SimpleDateFormat("yyyy年MM月dd日");
		}

	};

    private static final ThreadLocal<SimpleDateFormat> SDF_DATE_A=new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue(){
            return new SimpleDateFormat("yyyy/MM/dd");
        }

    };




//	static SimpleDateFormat SDF_DATE = new SimpleDateFormat("yyyy-MM-dd");
//	static SimpleDateFormat SDF_DATE_MONTH = new SimpleDateFormat("yyyy-MM");
//	static SimpleDateFormat SDF_DATETIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	static SimpleDateFormat SDF_WEEK_DATETIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
//	static SimpleDateFormat SDF_TIME = new SimpleDateFormat("HH:mm:ss");
//	static SimpleDateFormat SDF_DATE_ = new SimpleDateFormat("yyyyMMdd");
//	static SimpleDateFormat SDF_DATE_MIN = new SimpleDateFormat("yyMMdd");
//	static SimpleDateFormat SDF_M_D_H_M = new SimpleDateFormat("MMddHHmmS");
//	static SimpleDateFormat SDF_YYYYMM = new SimpleDateFormat("yyyyMM");
//
//	static SimpleDateFormat SDF_TIME_NO_POINT = new SimpleDateFormat("HHmmss");
//	static SimpleDateFormat SDF_TIME_MIN = new SimpleDateFormat("HHmm");
//
//	static SimpleDateFormat SDF_DATE_MIN_SHORT = new SimpleDateFormat("MM-dd HH:mm");
//	static SimpleDateFormat SDF_HTBX_DATETIME = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//	static SimpleDateFormat SDF_DATETIME_yyyyMMddHHmmss = new SimpleDateFormat("yyyyMMddHHmmss");
//	static SimpleDateFormat SDF_DATE_YEAR = new SimpleDateFormat("yyyy年MM月dd日");
	public static long getTomorrowZeroSeconds() {
		long current = System.currentTimeMillis();// 当前时间毫秒数
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		long tomorrowzero = calendar.getTimeInMillis();
		long tomorrowzeroSeconds = (tomorrowzero - current) / 1000;
		return tomorrowzeroSeconds;
	}

	/**
	 * Thu May 21 00:00:00 CST 2015
	 * 
	 * @return
	 */
	public static Date today() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 获取今天字符串日期，格式：yyyy-MM-dd
	 * @return
	 */
	public static String getTodayStr(){
		return formatDate(today());
	}

	/**
	 * Sun May 31 00:00:00 CST 2015
	 * 
	 * @param d 提前或滞后的天数
	 * @return
	 */
	public static Date dateDiff(int d) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		cal.add(Calendar.DAY_OF_YEAR, d);
		return cal.getTime();
	}

	public static int minutesDiff(String startTime, String endTime) throws ParseException {
		long startTimeInMilli = SDF_DATETIME.get().parse(startTime).getTime();
		long endTimeInMilli = SDF_DATETIME.get().parse(endTime).getTime();
		long minute = (endTimeInMilli - startTimeInMilli) / (1000 * 60);// 转化minute
		return (int) minute;
	}

	public static Date dateDiffHour(int h) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR_OF_DAY, h);
		return cal.getTime();
	}

	/**
	 * 今天之后某年的时期
	 * 
	 * @param year
	 * @return yyyy-MM-d
	 */
	public static String addYear(int year) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.add(Calendar.YEAR, +year);// 日期减1年
		return SDF_DATE.get().format(rightNow.getTime());
	}

	/**
	 * 计算天数
	 * 
	 * @param startTime
	 * @param endTime
	 * @return
	 * @throws Exception
	 */
	public static int getDays(String startTime, String endTime) throws Exception {
		return (int) ((SDF_DATE.get().parse(endTime).getTime() - SDF_DATE.get().parse(startTime).getTime()) / (24 * 60 * 60 * 1000));

	}

	/**
	 * String类型的日期转换为Timestamp类型
	 * 
	 * @param time
	 * @return
	 */
	public Timestamp StringToTimestamp(String time) {
		return Timestamp.valueOf(time);
	}

	/**
	 * Sun May 31 14:17:28 CST 2015
	 * 
	 * @param d 提前或滞后的天数
	 * @return Date日期
	 */
	public static Date addDay(int d) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, d);
		return cal.getTime();
	}

	/**
	 * 计算时间加天数
	 * 
	 * @param time
	 * @param d
	 * @return
	 * @throws Exception
	 */
	public static Date addDay(String time, int d) throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.setTime(SDF_DATE.get().parse(time));
		cal.add(Calendar.DAY_OF_YEAR, d);
		return cal.getTime();
	}

	/**
	 * 计算时间加天数
	 *
	 * @param time
	 * @param d
	 * @return
	 * @throws Exception
	 */
	public static Date addDay(Date time, int d) throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.setTime(time);
		cal.add(Calendar.DAY_OF_YEAR, d);
		return cal.getTime();
	}

	public static String formatDateTime(Date date) {
		return SDF_DATETIME.get().format(date);

	}

	public static String formatDateMonthTime(Date date) {
		return SDF_DATE_MONTH.get().format(date);

	}

	public static String formatWeekDateTime(Date date) {
		return SDF_WEEK_DATETIME.get().format(date);

	}

	public static String formatDate_(Date date) {
		return SDF_DATE_.get().format(date);

	}
    public static String parseDateStringA(Date date) throws Exception {
        return SDF_DATE_A.get().format(date);
    }

	public static String formatTime(Date date) {
		return SDF_TIME.get().format(date);
	}

	public static String formatTimeNoPoint(Date date) {
		return SDF_TIME_NO_POINT.get().format(date);
	}

	public static String formatDate(Date date) {
		return SDF_DATE.get().format(date);
	}

	public static Date parseString(String time)  {
		try {
			return SDF_DATE.get().parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Date parseyyyymmdd(String time) throws Exception {
		return SDF_DATE_.get().parse(time);
	}

	public static String formatDateHm(Date date) {
		return SDF_M_D_H_M.get().format(date);
	}

	public static String formatDateYYYYMM(Date date) {
		return SDF_YYYYMM.get().format(date);
	}

	/**
	 * HH:MM:SS
	 * 
	 * @param time
	 * @return
	 */
	public static int time2Int(String time) {
		return Short.parseShort(time.substring(0, 2)) * 60 + Short.parseShort(time.substring(3, 5));
	}

	/**
	 * 
	 * @param time
	 * @return
	 */
	public static Timestamp string2Timestamp(String time) {
		try {
			return new Timestamp(TimeUtil.SDF_DATE.get().parse(time).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Timestamp getTimeStamp() {
		return new Timestamp(System.currentTimeMillis());
	}

	public static int getDays(Timestamp startTime, Timestamp endTime) {
		return (int) ((endTime.getTime() - startTime.getTime()) / 1000 / 60 / 60 / 24);
	}

	public static Timestamp addYearDays(int year, int days) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.add(Calendar.YEAR, year);// 日期减1年
		rightNow.add(Calendar.DAY_OF_YEAR, days);// 日期加10天
		return Timestamp.valueOf(SDF_DATETIME.get().format(rightNow.getTime()));
	}

	public static Timestamp stampAdd(Timestamp time, Integer day) {
		try {
			Date date = SDF_DATETIME.get().parse(time.toString());
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DAY_OF_YEAR, day);// 日期加10天
			date = cal.getTime();
			return new Timestamp(date.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Date parseDateString(String time) throws Exception {
		return SDF_DATETIME.get().parse(time);
	}
	
	public static String formatDateMin(Date date) {
		return SDF_DATE_MIN.get().format(date);

	}
	public static String formatTimeMin(Date date) {
		return SDF_TIME_MIN.get().format(date);

	}

	
	public static  String transferLongToDate(String dateFormat,Long millSec){
	     SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	     Date date= new Date(millSec);
	     return sdf.format(date);
	    }
	/**
	 * 设置时间格式00:00:00 or 23:59:59
	 *
	 * @param date
	 * @flag 0 返回yyyy-MM-dd 00:00:00日期<br>
	 *       1 返回yyyy-MM-dd 23:59:59日期
	 * @return
	 */
	public static Date weeHours(Date date, int flag) {
		if (date == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		// 时分秒（毫秒数）
		long millisecond = hour * 60 * 60 * 1000 + minute * 60 * 1000 + second * 1000;
		// 凌晨00:00:00
		cal.setTimeInMillis(cal.getTimeInMillis() - millisecond);

		if (flag == 0) {
			return cal.getTime();
		} else if (flag == 1) {
			// 凌晨23:59:59
			cal.setTimeInMillis(cal.getTimeInMillis() + 23 * 60 * 60 * 1000 + 59 * 60 * 1000 + 59 * 1000);
		}
		return cal.getTime();
	}
	/**
	 * 几年几月几天
	 * @param ctime
	 * @return
	 */
	public static String getRegisterTime(Timestamp ctime) {

		Date currentTime = new Date();
		long regTime = ctime.getTime();
		long longtime = currentTime.getTime() - regTime;
		long countDay = longtime / 86400000;
		String days="";
		if (countDay<30) {
			days=countDay+"天";
		}else if(countDay>=30 && countDay<365){
			days=(int)(countDay/30)+"月";
			Long b=countDay%30;
			if (b>0) {
				days+=b+"天";
			}
		}else if(countDay>=365){
			days=(int) (countDay / 365) + "年";
			Long a=countDay%365;
			if (a>30) {
				days+=(int)(a/30)+"月";
				Long b=a%30;
				if (b>0) {
					days+=b+"天";
				}
			}
		}
		return days;
	}


	public static String formatShortDateTime(Date date) {
		return SDF_DATE_MIN_SHORT.get().format(date);

	}
	public static String formatHTBXDateTime(Date date) {
		return SDF_HTBX_DATETIME.get().format(date);

	}
	public static String formatDateTimeForyyyyMMddHHmmss(Date date) {
		return SDF_DATETIME_yyyyMMddHHmmss.get().format(date);

	}
	/**
	 * 计算两个日期之间相差的天数
	 * 
	 * @param smdate
	 *            较小的时间
	 * @param bdate
	 *            较大的时间
	 * @return 相差天数
	 * @throws ParseException
	 */
	public static int daysBetween(Date smdate, Date bdate) {

		try {
			smdate = SDF_DATE.get().parse(SDF_DATE.get().format(smdate));
			bdate = SDF_DATE.get().parse(SDF_DATE.get().format(bdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long betweenDays = (time2 - time1) / (1000 * 3600 * 24);
		return Integer.parseInt(String.valueOf(betweenDays));
	}
	/**
	 * 日期加年数
	 * @param date
	 * @param year
	 * @return
	 */
	public static Date dateAddYear(Date date, Integer year) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.YEAR, year);// 日期加10天
			return cal.getTime();
	}
	public static String formatDateYear(Date date) {
		return SDF_DATE_YEAR.get().format(date);

	}

	public static String parseStringToDateTime(String time,String formatDate, String format) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern(formatDate);
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern(format);
		return LocalDateTime.parse(time,df).format(df1);
	}

	public static boolean isToday(long time) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(time);
		Calendar todayCalendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int today = todayCalendar.get(Calendar.DAY_OF_MONTH);
		return day == today;
	}


	public static  boolean isBeforeWhenDate(Date date,Date whenDate){
		if(null==whenDate){
			return false;
		}
		if(null==date){
			return true;
		}

		return date.before(whenDate);

	}

	public static  boolean isBeforeWhenDate(Date date,String whenDate)  {
		if(StringUtils.isBlank(whenDate)){
			return false;
		}
		if (date == null){
		    return true;
        }
		Date when=null;
		try {
			when=SDF_DATETIME.get().parse(whenDate);
		}catch (Exception e){
			e.printStackTrace();
		}


		return isBeforeWhenDate(date,when);

	}

	/**
	 * @Description  时间戳格式日期加年
	 * @Author zgz
	 * @Date  2019/6/27 19:50
	 * @Param [time, year]
	 * @return java.sql.Timestamp
	 **/
	public static Timestamp stampAddYear(Timestamp time, Integer year) {
		try {
			Date date = SDF_DATETIME.get().parse(time.toString());
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.YEAR, year);// 日期加10天
			date = cal.getTime();
			return new Timestamp(date.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @Description  时间戳格式日期加月
	 * @Author zgz
	 * @Date  2019/6/27 19:49
	 * @Param [time, month]
	 * @return java.sql.Timestamp
	 **/
	public static Timestamp stampAddMonth(Timestamp time, Integer month) {
		try {
			Date date = SDF_DATETIME.get().parse(time.toString());
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.MONTH, month);// 日期加月
			date = cal.getTime();
			return new Timestamp(date.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

//	public static void main(String[] args) throws ParseException {
//		String dateStr = "2019-05-18 12:59:39";
//		Date date =new Date();
//		long t=System.currentTimeMillis();
//		for(int i=0;i<1000000;i++){
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            sdf.format(new Date());
//        }
//        long t1=System.currentTimeMillis();
//		System.out.println("time s+"+(t1-t));
//        t=System.currentTimeMillis();
//        for(int i=0;i<1000000;i++){
//            SDF_DATE.get().format(new Date());
//        }
//        t1=System.currentTimeMillis();
//        System.out.println("time s+"+(t1-t));
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println("$$$$$+"+sdf.format(new Date()));
//        System.out.println("$$$$$+"+SDF_DATE.get().format(new Date()));
//
//		System.out.println(isBeforeWhenDate(new Date(),dateStr));
//	}
public static void main(String[] args) {
	    try {
            System.out.println(parseDateStringA(new Date()));
        }catch (Exception e){
	        e.printStackTrace();
        }

}
}
