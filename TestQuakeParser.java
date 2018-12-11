/**
 * @author ${hisham_maged10}
 *https://github.com/hisham-maged10
 * ${DesktopApps}
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.util.NoSuchElementException;
public class TestQuakeParser
{
	private static final String PAST_HOUR_URL="https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.atom";
	private static final String PAST_DAY_URL="https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.atom";
	private static final String PAST_WEEK_URL="https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
	private static final String PAST_MONTH_URL="https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_month.atom";
	public static void main(String[] args)
	{
		testing();
	}
	public static void testing()
	{
		/*EarthQuakesParser parser=new EarthQuakesParser();
		ArrayList<QuakeEntry> list=parser.getQuakesInfo();
		System.out.println("Loaded quakes");
		for(QuakeEntry e:list)
			System.out.println(e);
		System.out.println("#"+list.size()+" loaded");
		list=parser.getBigQuakes(5.0);
		System.out.println();
		System.out.println("Loaded quakes with magnitude larger than 5.0");
		for(QuakeEntry e:list)
			System.out.println(e);
		System.out.println("Number of items that match the criteria is "+list.size());
		list=parser.getClosest(new Location(-6.211,106.845),3);
		System.out.println();
		System.out.println("Closest earthquake to jakarta is");
		for(QuakeEntry e:list)
			System.out.println(e);
		list=parser.filterByDistanceFrom(1000,new Location(38.17, -118.82));
		System.out.println();
		System.out.println("earthquakes read under 1000 km from kza are");
		for(QuakeEntry e:list)
			System.out.println(e);
		System.out.println("Number of items that match the criteria is "+list.size());
		list=parser.filterByDepth(-8000.0,-5000.0);
		System.out.println();
		System.out.println("earthquakes read of depth between -8k and -5k are");
		for(QuakeEntry e:list)
			System.out.println(e);
		System.out.println("Number of items that match the criteria is "+list.size());
		list=parser.filterByPhrase("any","Creek");
		System.out.println();
		System.out.println("earthquakes read of need");
		for(QuakeEntry e:list)
			System.out.println(e);
		System.out.println("Number of items that match the criteria is "+list.size());
		list=parser.findLargestQuakes(5);
		System.out.println();
		System.out.println("Largest earhquakes are");
		for(QuakeEntry e:list)
			System.out.println(e);
		System.out.println("Number of items that match the criteria is "+list.size());*/
		System.out.println("**** Choose an Option ****");
		System.out.println("1.Past Hour's EarthQuakes");
		System.out.println("2.Past Day's EarthQuakes");
		System.out.println("3.Past Week's EarthQuakes");
		System.out.println("4.Past Month's EarthQuakes");
		System.out.print("Choose an option: ");
		EarthQuakesParser parser=null;
		try{
		switch(new Scanner(System.in).nextInt())
		{
			case 1:parser=new EarthQuakesParser(new URL(PAST_HOUR_URL)); break;
			case 2:parser=new EarthQuakesParser(new URL(PAST_DAY_URL)); break;
			case 3:parser=new EarthQuakesParser(new URL(PAST_WEEK_URL)); break;
			case 4:parser=new EarthQuakesParser(new URL(PAST_MONTH_URL)); break;
			default:System.out.println("wrong input!");return;
		}
		}catch(IOException | NoSuchElementException ex){System.out.println("Incorrect response, causing termination!"); return;}
		//ArrayList<QuakeEntry> list=parser.filter(new MagnitudeFilter(4.0,5.0), new DepthFilter(-35000.0,-12000.0));
		ArrayList<QuakeEntry> list=parser.getQuakesInfo();
		//System.out.println("#"+list.size()+" loaded");
		//list=parser.filter(new DistanceFilter(10000,new Location(35.42,139.43)), new PhraseFilter("end","Japan"));
		//list=parser.filter(new MagnitudeFilter(0.0,2.0),new DepthFilter(-100000.0,-10000.0),new PhraseFilter("any","a"));
		//list=parser.filter(new MagnitudeFilter(0.0,3.0),new DistanceFilter(10000,new Location(36.1314,-95.9372)),new PhraseFilter("any","Ca"));
		//list=parser.filter(new DistanceFilter(3000,new Location(35.42, 139.43)),new PhraseFilter("end","Japan"));
		//list=parser.filter(new MagnitudeFilter(0.0,2.0),new DepthFilter(-100000.0,-10000.0),new PhraseFilter("any","a"));
		//list=parser.filter(new PhraseFilter("any","Can"));
		//list=parser.findLargestQuakes(50);
		//list=parser.filter(new MagnitudeFilter(0.0,5.0),new DistanceFilter(3000,new Location(55.7308, 9.1153)),new PhraseFilter("any","e"));
		//list=parser.sortByMagnitudeDestructiveSelection();
		//list=parser.sortByMagnitudeInPlaceSelection();
		//list=parser.sortByMagnitudeInPlaceBubble();
		//list=parser.sortByMagnitudeInPlaceBubbleChecked();
		//list=parser.sortByLargestDepthSelection();
		//list=parser.sortByMagnitudeInPlaceSelectionChecked();
		//list=parser.sort();
		//list=parser.sortComparator(new TitleDepthComparator());
		System.out.println("QuakeEntries:-");
		for(QuakeEntry e:list)
			System.out.println(e);
		System.out.println("Number of items Loaded #"+list.size());
		//System.out.println("quake at position 500 is");
		//System.out.println(list.get(500));
		System.out.println();
		
	}

	
}