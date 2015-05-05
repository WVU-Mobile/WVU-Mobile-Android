package wvumobile.wvumobile;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.ArrayList;

public class BusActivity extends ActionBarActivity implements View.OnClickListener {

    private MapView mMapView;
    private GoogleMap mMap;
    private static ArrayList<Marker> markers = new ArrayList<Marker>() ;
    int busLine = 0;

    //Campus PM(1) locations
    private LatLng Fieldcrest = new LatLng(39.652991, -79.963512);
    private LatLng Ruby = new LatLng(39.652122, -79.955629);
    private LatLng ValleyView = new LatLng(39.651050, -79.949585);
    private LatLng StewartST = new LatLng(39.646260, -79.945115);
    private LatLng Sunnyside = new LatLng(39.637769, -79.954792);
    private LatLng Mountainlair = new LatLng(39.634880, -79.954604);
    private LatLng HighStreet = new LatLng(39.629292, -79.956736);
    private LatLng SpruceSt = new LatLng(39.630819, -79.953977);

    //Downtown PM Mall(2) locations
    private LatLng Willowdale = new LatLng(39.654949, -79.953311);
    private LatLng BoremanHall = new LatLng(39.633525, -79.953004);
    private LatLng WarnerTheatre = new LatLng(39.628942, -79.956950);
    private LatLng WestoverTriangle = new LatLng(39.634696, -79.969858);
    private LatLng WestoverPNR = new LatLng(39.630772, -79.977013);
    private LatLng WestoverTerminal = new LatLng(39.632375, -79.976530);
    private LatLng TheCommons = new LatLng(39.630491, -80.001948);
    private LatLng MorgantownMallTheatre = new LatLng(39.627116, -79.999424);
    private LatLng PublicSafetyBuilding = new LatLng(39.629767, -79.954879);

    //Green Line(3) locations
    private LatLng Depot = new LatLng(39.629059, -79.959809);
    private LatLng BankMorgantownHotel = new LatLng(39.629497, -79.957370);
    private LatLng RamadaInn = new LatLng(39.587851, -79.957093);
    private LatLng ValleyHealth = new LatLng(39.586802, -79.965975);
    private LatLng Walmart = new LatLng(39.578803, -79.959495);
    private LatLng DorseyKnobPark = new LatLng(39.597093, -79.958160);
    private LatLng ShopNSave = new LatLng(39.633281, -79.981347);
    private LatLng WestoverBP = new LatLng(39.631038, -79.984486);
    private LatLng SuperKMart = new LatLng(39.630491, -80.001948);
    private LatLng WestoverMcDonalds = new LatLng(39.630835, -79.984623);
    private LatLng RingerLawOffice = new LatLng(39.632688, -79.981966);


    //Orange Line(4) locations
    private LatLng Westover = new LatLng(39.632384, -79.976609);
    private LatLng MorgantownMall = new LatLng(39.626963,-79.996891);
    private LatLng UniversityTownCentre = new LatLng(39.645563, -79.999281);
    private LatLng Towers = new LatLng(39.648975, -79.966346);
    private LatLng Beechurst = new LatLng(39.634675, -79.956430);
    private LatLng Downtown = new LatLng(39.632384, -79.976609);
    private LatLng SouthparkFirstWard = new LatLng(39.632384, -79.976609);
    private LatLng MorgantownHighSchool = new LatLng(39.623727, -79.956456);
    private LatLng WhitePark = new LatLng(39.614337, -79.957809);
    private LatLng MountaineerMall = new LatLng(39.606411, -79.962235);

    //Gold Line(6) locations
    private LatLng MountaineerStation = new LatLng(39.654811, -79.961377);
    private LatLng MedicalArts = new LatLng(39.658058, -79.963054);
    private LatLng IndepHill = new LatLng(39.675729, -79.961097);
    private LatLng NorthHills = new LatLng(39.666587, -79.951486);
    private LatLng MonGeneral = new LatLng(39.663660, -79.945850);
    private LatLng EMooreHall = new LatLng(39.634884, -79.954589);
    private LatLng WestRunRoad = new LatLng(39.668552, -79.947761);

    //Red Line(7) locations
    private LatLng UnityManor = new LatLng(39.631885, -79.950752);
    private LatLng Evansdale = new LatLng(39.649377, -79.964146);
    private LatLng StarCity = new LatLng(39.660651, -79.984337);
    private LatLng Suncrest = new LatLng(39.654441, -79.969711);
    private LatLng LawSchool = new LatLng(39.647841, -79.960318);
    private LatLng CourtHouse = new LatLng(39.629068, -79.956737);

    //Tyrone(8) locations
    private LatLng Richwood = new LatLng(39.629795, -79.947923);
    private LatLng DMV = new LatLng(39.628511, -79.933399);
    private LatLng JeromePark = new LatLng(39.632790, -79.931696);
    private LatLng Sabraton = new LatLng(39.628214, -79.929945);
    private LatLng Brookhaven = new LatLng(39.609158, -79.920528);
    private LatLng TyroneRoad = new LatLng(39.609158, -79.920539);
    private LatLng SunsetBeach = new LatLng(39.677709, -79.857763);
    private LatLng CheatLake = new LatLng(39.668258, -79.859238);

    //Purple Line(9) locations
    private LatLng ChestnutHill = new LatLng(39.654265, -79.949695);

    //Cassville (11) locations
    private LatLng WalnutPRT = new LatLng(39.629989, -79.957215);
    private LatLng GranvilleVFD = new LatLng(39.645105, -79.986330);
    private LatLng GranvillePNR = new LatLng(39.648582, -79.990298);
    private LatLng BerthaHill = new LatLng(39.661513, -79.995921);
    private LatLng CassvilleNewHill = new LatLng(39.665394, -80.062787);

    //Blue Line(12) locations
    private LatLng WoodlandTerrace = new LatLng(39.635073, -79.925082);
    private LatLng MarillaPark = new LatLng(39.628187, -79.939392);
    private LatLng HartmanRun = new LatLng(39.633198, -79.927714);
    private LatLng Airport = new LatLng(39.644008, -79.920109);
    private LatLng UniversityHS = new LatLng(39.687748, -79.924974);
    private LatLng Canyon = new LatLng(39.671462, -79.890005);

    //Crown(13) locations
    private LatLng LaurelPoint = new LatLng(-39.619283, -80.029911);
    private LatLng ArnettesvilleCommunityCenter = new LatLng(39.582781, -80.094273);
    private LatLng Everettsville = new LatLng(39.563092, -80.067400);
    private LatLng OpekiskaDam = new LatLng(39.563582, -80.052711);
    private LatLng Booth = new LatLng(39.597175, -80.015306);
    private LatLng RiverRoadVFD = new LatLng(39.598729, -80.007517);

    //Mountain Heights(14) locations
    private LatLng BrockwayAve = new LatLng(39.628180, -79.939062);
    private LatLng Kroger = new LatLng(39.621521, -79.923880);
    private LatLng SummersSchoolRoad = new LatLng(39.578242, -79.890511);
    private LatLng MountainHeights = new LatLng(39.589728, -79.928879);
    private LatLng KingwoodPike = new LatLng(39.589723, -79.928873);
    private LatLng GiantEagle = new LatLng(39.607652, -79.962321);

    //Grafton Raod(15) locations
    private LatLng Aldi = new LatLng(39.612794, -79.970208);
    private LatLng GreenbagRoad = new LatLng(39.605566, -79.966829);
    private LatLng AshtonEstates = new LatLng(39.584183, -79.980000);
    private LatLng GoshenRoadPNR = new LatLng(39.538406, -79.994966);
    private LatLng HalleckRoad = new LatLng(39.520994, -80.015791);
    private LatLng TriuneHalleckVFD = new LatLng(39.497172, -79.976930);

    //Pink Line(16) locations
    private LatLng WilleyStreet = new LatLng(39.598783, -80.007500);
    private LatLng Mileground = new LatLng(39.644816, -79.926895);
    private LatLng HondaShop = new LatLng(39.648938, -79.921203);
    private LatLng GlenmarkCenter = new LatLng(39.648821, -79.901130);
    private LatLng EastonHill = new LatLng(39.652290, -79.913929);
    private LatLng ArnoldApartments = new LatLng(39.631893, -79.950767);

    //West Run (30) locations
    private LatLng WestRunComplex = new LatLng(39.656945, -79.925476);
    private LatLng GlenMarkBonVista = new LatLng(39.654556, -79.933733);
    private LatLng SuncrestTownCentre = new LatLng(39.653879, -79.935052);
    private LatLng ChestnutRidge = new LatLng(39.649579, -79.942034);
    private LatLng StewartPlaceLewisStreet = new LatLng(39.647745, -79.943563);
    private LatLng ShortyAndersons = new LatLng(39.646063, -79.945109);
    private LatLng HoffmanVanGuilder = new LatLng(39.642625, -79.947577);
    private LatLng ExpressMart = new LatLng(39.642234, -79.949758);
    private LatLng StewartUniversity = new LatLng(39.637655, -79.954787);
    private LatLng CopperBeech = new LatLng(39.655215, -79.927773);

    //Blue and Gold (38) locations
    private LatLng TowersPRT = new LatLng(39.647558, -79.967770);
    private LatLng Oakland = new LatLng(39.649394, -79.964124);
    //private LatLng GrantAtSixth = new LatLng(39.642266, -79.960103);
    private LatLng GrantAtFourth = new LatLng(39.640934, -79.958061);
    private LatLng LifeSciences = new LatLng(39.638069, -79.956017);
    private LatLng CAC = new LatLng(39.647032, -79.974160);
    private LatLng EngineeringPRT = new LatLng(39.647032, -79.974160);
    private LatLng EvansdaleLibrary = new LatLng(39.644907, -79.970809);
    private LatLng AllenHall = new LatLng(39.645154, -79.968635);

    //Valley View (44) locations
    private LatLng StewartstownRoad = new LatLng(39.642612, -79.947587);
    private LatLng FallingRun = new LatLng(39.637480, -79.952593);
    private LatLng LifesciencesBNE = new LatLng(39.637284, -79.953451);

    //Table Rows
    private TableRow b_row1;
    private TableRow b_row2;
    private TableRow b_row3;
    private TableRow b_row4;
    private TableRow b_row5;
    private TableRow b_row6;
    private TableRow b_row7;
    private TableRow b_row8;
    private TableRow b_row9;
    private TableRow b_row10;
    private TableRow b_row11;
    private TableRow b_row12;
    private TableRow b_row13;
    private TableRow b_row14;
    private TableRow b_row15;
    private TableRow b_row16;

    private TextView b_hrtxt;
    private TextView b_txt1;
    private TextView b_txt2;
    private TextView b_txt3;
    private TextView b_txt4;
    private TextView b_txt5;
    private TextView b_txt6;
    private TextView b_txt7;
    private TextView b_txt8;
    private TextView b_txt9;
    private TextView b_txt10;
    private TextView b_txt11;
    private TextView b_txt12;
    private TextView b_txt13;
    private TextView b_txt14;
    private TextView b_txt15;
    private TextView b_txt16;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        MapsInitializer.initialize(getApplicationContext());
        mMapView = (MapView) findViewById(R.id.b_map);
        mMapView.onCreate(savedInstanceState);

        Intent intent = getIntent();
        busLine = intent.getIntExtra(buses_Fragment.EXTRA_MESSAGE, 0);

        b_hrtxt = (TextView) findViewById(R.id.b_htext);
        b_row1 = (TableRow) findViewById(R.id.bloc_1);
        b_row1.setOnClickListener(this);
        b_txt1 = (TextView) findViewById(R.id.b_text1);
        b_row2 = (TableRow) findViewById(R.id.bloc_2);
        b_row2.setOnClickListener(this);
        b_txt2 = (TextView) findViewById(R.id.b_text2);
        b_row3 = (TableRow) findViewById(R.id.bloc_3);
        b_row3.setOnClickListener(this);
        b_txt3 = (TextView) findViewById(R.id.b_text3);
        b_row4 = (TableRow) findViewById(R.id.bloc_4);
        b_row4.setOnClickListener(this);
        b_txt4 = (TextView) findViewById(R.id.b_text4);
        b_row5 = (TableRow) findViewById(R.id.bloc_5);
        b_row5.setOnClickListener(this);
        b_txt5 = (TextView) findViewById(R.id.b_text5);
        b_row6 = (TableRow) findViewById(R.id.bloc_6);
        b_row6.setOnClickListener(this);
        b_txt6 = (TextView) findViewById(R.id.b_text6);
        b_row7 = (TableRow) findViewById(R.id.bloc_7);
        b_row7.setOnClickListener(this);
        b_txt7 = (TextView) findViewById(R.id.b_text7);
        b_row8 = (TableRow) findViewById(R.id.bloc_8);
        b_row8.setOnClickListener(this);
        b_txt8 = (TextView) findViewById(R.id.b_text8);
        b_row9 = (TableRow) findViewById(R.id.bloc_9);
        b_row9.setOnClickListener(this);
        b_txt9 = (TextView) findViewById(R.id.b_text9);
        b_row10 = (TableRow) findViewById(R.id.bloc_10);
        b_row10.setOnClickListener(this);
        b_txt10 = (TextView) findViewById(R.id.b_text10);
        b_row11 = (TableRow) findViewById(R.id.bloc_11);
        b_row11.setOnClickListener(this);
        b_txt11 = (TextView) findViewById(R.id.b_text11);
        b_row12 = (TableRow) findViewById(R.id.bloc_12);
        b_row12.setOnClickListener(this);
        b_txt12 = (TextView) findViewById(R.id.b_text12);
        b_row13 = (TableRow) findViewById(R.id.bloc_13);
        b_row13.setOnClickListener(this);
        b_txt13 = (TextView) findViewById(R.id.b_text13);
        b_row14 = (TableRow) findViewById(R.id.bloc_14);
        b_row14.setOnClickListener(this);
        b_txt14 = (TextView) findViewById(R.id.b_text14);
        b_row15 = (TableRow) findViewById(R.id.bloc_15);
        b_row15.setOnClickListener(this);
        b_txt15= (TextView) findViewById(R.id.b_text15);
        b_row16 = (TableRow) findViewById(R.id.bloc_16);
        b_row16.setOnClickListener(this);
        b_txt16 = (TextView) findViewById(R.id.b_text16);

        setUpMapIfNeeded();
        switch(busLine)
        {
            case 1:
                //Campus PM (1)
                setTitle("Campus PM (1)");
                break;
            case 2:
                //Downtown PM Mall (2)
                setTitle("Downtown PM Mall (2)");
                break;
            case 3:
                //Green Line (3)
                setTitle("Green Line (3)");
                break;
            case 4:
                //Orange Line (4)
                setTitle("Orange Line (4)");
                break;
            case 5:
                //Gold Line (6)
                setTitle("Gold Line (6)");
                break;
            case 6:
                //Red Line (7)
                setTitle("Red Line (7)");
                break;
            case 7:
                //Tyrone (8)
                setTitle("Tyrone (8)");
                break;
            case 8:
                //Purple Line (9)
                setTitle("Purple Line (9)");
                break;
            case 9:
                //Cassville (11)
                setTitle("Cassville (11)");
                break;
            case 10:
                //Blue Line (12)
                setTitle("Blue Line (12)");
                break;
            case 11:
                //Crown (13)
                setTitle("Crown (13)");
                break;
            case 12:
                //Mountain Heights (14)
                setTitle("Mountain Heights (14)");
                break;
            case 13:
                //Grafton Road (15)
                setTitle("Grafton Road (15)");
                break;
            case 14:
                //Pink Line (16)
                setTitle("Pink Line (16)");
                break;
            case 15:
                //West Run (30)
                setTitle("West Run (30)");
                break;
            case 16:
                //Blue & Gold(38)
                setTitle("Blue & Gold (38)");
                break;
            case 17:
                //Valley View (44)
                setTitle("Valley View (44)");
                break;
            default:
                break;

        }
        hideExtraRows(busLine);
        setUpBusStops(busLine);
        updateMarkers(busLine);


    }

    public void hideExtraRows(int rowID)
    {
        switch(rowID)
        {
            case 1:
                b_row9.setVisibility(View.GONE);
                b_row10.setVisibility(View.GONE);
                b_row11.setVisibility(View.GONE);
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 2:
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 3:
                break;
            case 4:
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 5:
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 6:
                b_row10.setVisibility(View.GONE);
                b_row11.setVisibility(View.GONE);
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 7:
                b_row11.setVisibility(View.GONE);
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 8:
                b_row9.setVisibility(View.GONE);
                b_row10.setVisibility(View.GONE);
                b_row11.setVisibility(View.GONE);
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 9:
                b_row8.setVisibility(View.GONE);
                b_row9.setVisibility(View.GONE);
                b_row10.setVisibility(View.GONE);
                b_row11.setVisibility(View.GONE);
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 10:
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 11:
                b_row9.setVisibility(View.GONE);
                b_row10.setVisibility(View.GONE);
                b_row11.setVisibility(View.GONE);
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 12:
                b_row11.setVisibility(View.GONE);
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 13:
                b_row10.setVisibility(View.GONE);
                b_row11.setVisibility(View.GONE);
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 14:
                b_row11.setVisibility(View.GONE);
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 15:
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 16:
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            case 17:
                b_row8.setVisibility(View.GONE);
                b_row9.setVisibility(View.GONE);
                b_row10.setVisibility(View.GONE);
                b_row11.setVisibility(View.GONE);
                b_row12.setVisibility(View.GONE);
                b_row13.setVisibility(View.GONE);
                b_row14.setVisibility(View.GONE);
                b_row15.setVisibility(View.GONE);
                b_row16.setVisibility(View.GONE);
                break;
            default:
                break;
        }
    }

    public void setUpBusStops(int rowID)
    {
        switch(rowID)
        {
            case 1:
                b_hrtxt.setText(getResources().getText(R.string.bus_l1Hours));
                b_txt1.setText("Fieldcrest");
                b_txt2.setText("Ruby");
                b_txt3.setText("Valley View");
                b_txt4.setText("Stewart St.");
                b_txt5.setText("Sunnyside");
                b_txt6.setText("Mountainlair");
                b_txt7.setText("Court House");
                b_txt8.setText("Spruce St.");
                break;
            case 2:
                b_hrtxt.setText(getResources().getText(R.string.bus_l2Hours));
                b_txt1.setText("Willowdale");
                b_txt2.setText("Sunnyside");
                b_txt3.setText("Mountainlair");
                b_txt4.setText("Boreman Hall");
                b_txt5.setText("Warner Theatre");
                b_txt6.setText("Westover Triangle");
                b_txt7.setText("Westover Park & Ride");
                b_txt8.setText("Westover Terminal");
                b_txt9.setText("The Commons");
                b_txt10.setText("Morgantown Mall Theatre");
                b_txt11.setText("Public Safety Building");
                break;
            case 3:
                b_hrtxt.setText(getResources().getText(R.string.bus_l3Hours));
                b_txt1.setText("Depot");
                b_txt2.setText("South U. Plaza/Aldi");
                b_txt3.setText("Bank Plaza/Morgantown Motel");
                b_txt4.setText("Ramada Inn");
                b_txt5.setText("Valley Health");
                b_txt6.setText("Walmart");
                b_txt7.setText("Dorsey Knob Park");
                b_txt8.setText("Westover Triangle");
                b_txt9.setText("Westover Park & Ride");
                b_txt10.setText("Westover Terminal");
                b_txt11.setText("Shop N Shave");
                b_txt12.setText("Westover BP");
                b_txt13.setText("Super K-Mart");
                b_txt14.setText("Morgantown Mall");
                b_txt15.setText("Westover McDonalds");
                b_txt16.setText("Ringer Law Office");
                break;
            case 4:
                b_hrtxt.setText(getResources().getText(R.string.bus_l4Hours));
                b_txt1.setText("Depot");
                b_txt2.setText("Westover");
                b_txt3.setText("Morgantown Mall");
                b_txt4.setText("University Town Center");
                b_txt5.setText("Towers");
                b_txt6.setText("Beechurst");
                b_txt7.setText("Downtown");
                b_txt8.setText("South Park 1st Ward");
                b_txt9.setText("Morgantown High School");
                b_txt10.setText("White Park");
                b_txt11.setText("Mountaineer Mall");
                break;
            case 5:
                b_hrtxt.setText(getResources().getText(R.string.bus_l5Hours));
                b_txt1.setText("Public Safety Building");
                b_txt2.setText("Unity Manor");
                b_txt3.setText("Mountainlair");
                b_txt4.setText("Ruby");
                b_txt5.setText("Mountaineer Station");
                b_txt6.setText("Medical Arts");
                b_txt7.setText("Independence Hill");
                b_txt8.setText("North Hills");
                b_txt9.setText("Mon. General");
                b_txt10.setText("Towers");
                b_txt11.setText("E. Moore Hall");
                b_txt12.setText("High Street");
                b_txt13.setText("Villages at West Run");
                break;
            case 6:
                b_hrtxt.setText(getResources().getText(R.string.bus_l6Hours));
                b_txt1.setText("Depot");
                b_txt2.setText("Public Safety Building");
                b_txt3.setText("Unity Manor");
                b_txt4.setText("Mountainlair");
                b_txt5.setText("Evansdale");
                b_txt6.setText("Star City");
                b_txt7.setText("Suncrest");
                b_txt8.setText("Law School");
                b_txt9.setText("Court House");
                break;
            case 7:
                b_hrtxt.setText(getResources().getText(R.string.bus_l7Hours));
                b_txt1.setText("Depot");
                b_txt2.setText("Unity Manor");
                b_txt3.setText("Richwood");
                b_txt4.setText("DMV");
                b_txt5.setText("Jerome Park");
                b_txt6.setText("Sabraton");
                b_txt7.setText("Brookhaven");
                b_txt8.setText("Tyrone Road");
                b_txt9.setText("Sunset Beach/Ashbrooke");
                b_txt10.setText("Cheat Lake");
                break;
            case 8:
                b_hrtxt.setText(getResources().getText(R.string.bus_l8Hours));
                b_txt1.setText("Depot");
                b_txt2.setText("Public Safety Building");
                b_txt3.setText("Mountainlair");
                b_txt4.setText("Stewart St.");
                b_txt5.setText("Chestnut Hill Apartments");
                b_txt6.setText("Valley View");
                b_txt7.setText("Shorty's");
                b_txt8.setText("E. Moore Hall");
                break;
            case 9:
                b_hrtxt.setText(getResources().getText(R.string.bus_l9Hours));
                b_txt1.setText("Walnut PRT");
                b_txt2.setText("Westover");
                b_txt3.setText("Granville VFD");
                b_txt4.setText("Granville P&R");
                b_txt5.setText("Bertha Hill");
                b_txt6.setText("Cassville/New Hill");
                b_txt7.setText("University Town Centre/Walmart");
                break;
            case 10:
                b_hrtxt.setText(getResources().getText(R.string.bus_l10Hours));
                b_txt1.setText("Depot");
                b_txt2.setText("Unity Manor");
                b_txt3.setText("Marilla Park");
                b_txt4.setText("Sabraton");
                b_txt5.setText("Woodland Terrace");
                b_txt6.setText("Hartman Run");
                b_txt7.setText("Mileground Airport (By Request)");
                b_txt8.setText("University High School");
                b_txt9.setText("Canyon");
                b_txt10.setText("Easton Hill");
                b_txt11.setText("Arnold Apartments");
                break;
            case 11:
                b_hrtxt.setText(getResources().getText(R.string.bus_l11Hours));
                b_txt1.setText("Westover");
                b_txt2.setText("Laurel Point");
                b_txt3.setText("Arnettesville Community Center");
                b_txt4.setText("Everettsville");
                b_txt5.setText("Opekiska Dam");
                b_txt6.setText("Booth");
                b_txt7.setText("River Road VFD");
                b_txt8.setText("Westover");
                break;
            case 12:
                b_hrtxt.setText(getResources().getText(R.string.bus_l12Hours));
                b_txt1.setText("Depot");
                b_txt2.setText("Greenbag Road");
                b_txt3.setText("Brockway Ave.");
                b_txt4.setText("Sabraton");
                b_txt5.setText("Kroger");
                b_txt6.setText("Summers School Road");
                b_txt7.setText("Mountain Heights");
                b_txt8.setText("Kingwood Pike");
                b_txt9.setText("Mountaineer Mall");
                b_txt10.setText("DMV");
                break;
            case 13:
                b_hrtxt.setText(getResources().getText(R.string.bus_l13Hours));
                b_txt1.setText("Depot");
                b_txt2.setText("Aldi");
                b_txt3.setText("Greenbag Road");
                b_txt4.setText("Ashton Estates");
                b_txt5.setText("Goshen Rd. Park & Ride");
                b_txt6.setText("Halleck Road");
                b_txt7.setText("Triune-Halleck VFD");
                b_txt8.setText("Walmart");
                b_txt9.setText("Depot");
                break;
            case 14:
                b_hrtxt.setText(getResources().getText(R.string.bus_l14Hours));
                b_txt1.setText("Depot");
                b_txt2.setText("Public Safety Building");
                b_txt3.setText("Unity Manor");
                b_txt4.setText("Willey Street");
                b_txt5.setText("Mileground");
                b_txt6.setText("Honda Shop");
                b_txt7.setText("Glenmark Center");
                b_txt8.setText("Easton Hill");
                b_txt9.setText("Arnold Apartments");
                b_txt10.setText("Court House");
                break;
            case 15:
                b_hrtxt.setText(getResources().getText(R.string.bus_l15Hours));
                b_txt1.setText("West Run Complex");
                b_txt2.setText("Glenmark & Bon Vista");
                b_txt3.setText("Suncrest Town Centre");
                b_txt4.setText("Chestnut Ridge");
                b_txt5.setText("Stewart Place & Lewis Street");
                b_txt6.setText("Shorty Anderson's");
                b_txt7.setText("Hoffman/Van Guilder");
                b_txt8.setText("Express Mart");
                b_txt9.setText("Stewart & University");
                b_txt10.setText("Copper Beech");
                b_txt11.setText("Mountainlair (late night)");
                b_txt12.setText("Court House (late night)");
                b_txt13.setText("Pub. Saftey Building (late night)");
                break;
            case 16:
                b_hrtxt.setText(getResources().getText(R.string.bus_l16Hours));
                b_txt1.setText("Towers PRT");
                b_txt2.setText("Towers");
                b_txt3.setText("Oakland");
                b_txt4.setText("Law School");
                b_txt5.setText("Grant Avenue");
                b_txt6.setText("Life Sciences");
                b_txt7.setText("Beechurst");
                b_txt8.setText("Creative Arts Center)");
                b_txt9.setText("Engineering PRT");
                b_txt10.setText("Evansdale Library");
                b_txt11.setText("Allen Hall");
                break;
            case 17:
                b_hrtxt.setText(getResources().getText(R.string.bus_l17Hours));
                b_txt1.setText("Valley View");
                b_txt2.setText("Chestnut Ridge");
                b_txt3.setText("Stewartstown Road");
                b_txt4.setText("Falling Run");
                b_txt5.setText("Life Sciences/B&E");
                b_txt6.setText("Stewarts Street");
                b_txt7.setText("Willowdale");
                break;
            default:
                break;



        }
    }

    public void updateMarkers(int busID)
    {

        if(!markers.isEmpty())
        {
            markers.clear();
        }
        Marker marker;
        switch(busID)
        {
            case 1:
                for(int i = 0; i<8; i++) {
                        if(i == 0) {
                            marker = mMap.addMarker(new MarkerOptions().position(Fieldcrest).title("Fieldcrest").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                            markers.add(marker);
                        }
                        if(i == 1) {
                            marker = mMap.addMarker(new MarkerOptions().position(Ruby).title("Ruby").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));;
                            markers.add(marker);
                        }
                        if(i == 2) {
                            marker = mMap.addMarker(new MarkerOptions().position(ValleyView).title("Valley View").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                            markers.add(marker);
                        }
                        if(i == 3) {
                            marker = mMap.addMarker(new MarkerOptions().position(StewartST).title("Stewart Street").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                            markers.add(marker);
                        }
                        if(i == 4) {
                           marker = mMap.addMarker(new MarkerOptions().position(Sunnyside).title("Sunnyside").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                            markers.add(marker);
                        }
                        if(i == 5) {
                            marker = mMap.addMarker(new MarkerOptions().position(Mountainlair).title("Mountainlair").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                            markers.add(marker);
                        }
                        if(i == 6) {
                            marker = mMap.addMarker(new MarkerOptions().position(CourtHouse).title("Court House").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                            markers.add(marker);
                        }
                        if(i == 7) {
                            marker = mMap.addMarker(new MarkerOptions().position(SpruceSt).title("Spruce St.").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                            markers.add(marker);
                        }
                    }
                break;
            case 2:
                for(int i = 0; i<11; i++) {
                    if(i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(Willowdale).title("Willowdale").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(Sunnyside).title("Sunnyside").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(Mountainlair).title("Mountainlair").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(BoremanHall).title("Boreman Hall").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(WarnerTheatre).title("Warner Theatre").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(WestoverTriangle).title("Westover Triangle").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(WestoverPNR).title("Westover Park & Ride").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(WestoverTerminal).title("Westover Terminal").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 8) {
                        marker = mMap.addMarker(new MarkerOptions().position(TheCommons).title("The Commons").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 9) {
                        marker = mMap.addMarker(new MarkerOptions().position(MorgantownMallTheatre).title("Morgantown Mall Theatre").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 10) {
                        marker = mMap.addMarker(new MarkerOptions().position(PublicSafetyBuilding).title("Public Safety Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 3:
                for(int i = 0; i<16; i++) {
                    if(i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(Depot).title("Depot").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(Aldi).title("South U. Plaza/Aldi").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(BankMorgantownHotel).title("Bank Plaza/Morgantown Motel").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(RamadaInn).title("Ramada Inn").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(ValleyHealth).title("Valley Health").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(Walmart).title("Walmart").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(DorseyKnobPark).title("Dorsey Knob Park").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(WestoverTriangle).title("Westover Triangle").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 8) {
                        marker = mMap.addMarker(new MarkerOptions().position(WestoverPNR).title("Westover Park & Ride").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 9) {
                        marker = mMap.addMarker(new MarkerOptions().position(WestoverTerminal).title("Westover Terminal").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 10) {
                        marker = mMap.addMarker(new MarkerOptions().position(ShopNSave).title("Shop N Save").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 11) {
                        marker = mMap.addMarker(new MarkerOptions().position(WestoverBP).title("Westover BP").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 12) {
                        marker = mMap.addMarker(new MarkerOptions().position(SuperKMart).title("Super K-Mart").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 13) {
                        marker = mMap.addMarker(new MarkerOptions().position(MorgantownMall).title("Morgantown Mall").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 14) {
                        marker = mMap.addMarker(new MarkerOptions().position(WestoverMcDonalds).title("Westover McDonalds").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if(i == 15) {
                        marker = mMap.addMarker(new MarkerOptions().position(RingerLawOffice).title("Ringer Law Office").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                System.out.println("SIZE: "+markers.size());
                break;
            case 4:
                for(int i = 0; i<11; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(Depot).title("Depot").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(Westover).title("Westover").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(MorgantownMall).title("Morgantown Mall").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(UniversityTownCentre).title("University Town Centre").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(Towers).title("Towers").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(Beechurst).title("Beechurst").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(Downtown).title("Downtown").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(SouthparkFirstWard).title("SouthPark 1st Ward").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 8) {
                        marker = mMap.addMarker(new MarkerOptions().position(MorgantownHighSchool).title("Morgantown High School").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 9) {
                        marker = mMap.addMarker(new MarkerOptions().position(WhitePark).title("White Park").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 10) {
                        marker = mMap.addMarker(new MarkerOptions().position(MountaineerMall).title("Mountaineer Mall").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 5:
                for(int i = 0; i<13; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(PublicSafetyBuilding).title("Public Safety Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(UnityManor).title("Unity Manor").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(Mountainlair).title("Mountainlair").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(Ruby).title("Ruby").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(MountaineerStation).title("Mountaineer Station").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(MedicalArts).title("Medical Arts").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(IndepHill).title("Independence Hill").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(NorthHills).title("North Hills").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 8) {
                        marker = mMap.addMarker(new MarkerOptions().position(MonGeneral).title("Mon General").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 9) {
                        marker = mMap.addMarker(new MarkerOptions().position(Towers).title("Towers").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 10) {
                        marker = mMap.addMarker(new MarkerOptions().position(EMooreHall).title("E. Moore Hall").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 11) {
                        marker = mMap.addMarker(new MarkerOptions().position(HighStreet).title("High Street").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 12) {
                        marker = mMap.addMarker(new MarkerOptions().position(WestRunComplex).title("Villages at West Run").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 6:
                for(int i = 0; i<9; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(Depot).title("Depot").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(PublicSafetyBuilding).title("Public Safety Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(UnityManor).title("Unity Manor").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(Mountainlair).title("Mountainlair").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(Evansdale).title("Evansdale").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(StarCity).title("Star City").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(Suncrest).title("Suncrest").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(LawSchool).title("Law School").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 8) {
                        marker = mMap.addMarker(new MarkerOptions().position(CourtHouse).title("Court House").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 7:
                for(int i = 0; i<10; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(Depot).title("Depot").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(UnityManor).title("Unity Manor").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(Richwood).title("Richwood").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(DMV).title("DMV").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(JeromePark).title("Jerome Park").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(Sabraton).title("Sabraton").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(Brookhaven).title("Brookhaven").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(TyroneRoad).title("Tyrone Road").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 8) {
                        marker = mMap.addMarker(new MarkerOptions().position(SunsetBeach).title("Sunset Beach/Ashbrooke").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 9) {
                        marker = mMap.addMarker(new MarkerOptions().position(CheatLake).title("Cheat Lake").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 8:
                for(int i = 0; i<8; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(Depot).title("Depot").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(PublicSafetyBuilding).title("Public Safety Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(Mountainlair).title("Mountainlair").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(StewartST).title("Stewart St.").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(ChestnutHill).title("Chestnut Hill Apartments").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(ValleyView).title("Valley View").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(ShortyAndersons).title("Shorty's").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(EMooreHall).title("E. Moore Hall").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 9:
                for(int i = 0; i<7; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(WalnutPRT).title("Walnut PRT").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(Westover).title("Westover").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(GranvilleVFD).title("Granville VFD").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(GranvillePNR).title("Granville Park & Ride").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(BerthaHill).title("Bertha Hill").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(CassvilleNewHill).title("Cassville/New Hill").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(UniversityTownCentre).title("University Town Centre/Walmart").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 10:
                for(int i = 0; i<11; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(Depot).title("Depot").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(UnityManor).title("Unity Manor").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(MarillaPark).title("Marilla Park").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(Sabraton).title("Sabraton").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(WoodlandTerrace).title("Woodland Terrace").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(HartmanRun).title("Hartman Run").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(Airport).title("Mileground Airport").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(UniversityHS).title("University High School").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 8) {
                        marker = mMap.addMarker(new MarkerOptions().position(Canyon).title("Canyon").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 9) {
                        marker = mMap.addMarker(new MarkerOptions().position(EastonHill).title("Easton Hill").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 10) {
                        marker = mMap.addMarker(new MarkerOptions().position(ArnoldApartments).title("Arnold Apartments").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 11:
                for(int i = 0; i<8; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(Depot).title("Depot").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(LaurelPoint).title("Laurel Point").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(ArnettesvilleCommunityCenter).title("Arnettsville Community Center").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(Everettsville).title("Everettsville").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(OpekiskaDam).title("Opekiska Dam").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(Booth).title("Booth").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(RiverRoadVFD).title("River Road VFD").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(Westover).title("Westover").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 12:
                for(int i = 0; i<10; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(Depot).title("Depot").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(GreenbagRoad).title("Greenbag Road").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(BrockwayAve).title("Brockwawy Ave.").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(Sabraton).title("Sabraton").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(Kroger).title("Kroger").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(SummersSchoolRoad).title("Summers School Road").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(MountainHeights).title("Mountain Heights").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(KingwoodPike).title("Kingwood Pike").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 8) {
                        marker = mMap.addMarker(new MarkerOptions().position(GiantEagle).title("Mountaineer Mall").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 9) {
                        marker = mMap.addMarker(new MarkerOptions().position(DMV).title("DMV").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 13:
                for(int i = 0; i<8; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(Depot).title("Depot").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(Aldi).title("Aldi").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(GreenbagRoad).title("Greenbag Road").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(AshtonEstates).title("Ashton Estates").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(GoshenRoadPNR).title("Goshen Road Park & Ride").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(HalleckRoad).title("Halleck Road").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(TriuneHalleckVFD).title("Triune-Halleck VFD").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(Walmart).title("Walmart").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 14:
                for(int i = 0; i<10; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(Depot).title("Depot").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(PublicSafetyBuilding).title("Public Safety Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(UnityManor).title("Unity Manor").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(WilleyStreet).title("Willey Street").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(Mileground).title("Mileground").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(HondaShop).title("Honda Shop").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(GlenmarkCenter).title("Glenmark Center").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(EastonHill).title("Easton Hill").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 8) {
                        marker = mMap.addMarker(new MarkerOptions().position(ArnoldApartments).title("Arnold Apartments").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 9) {
                        marker = mMap.addMarker(new MarkerOptions().position(CourtHouse).title("Court House").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 15:
                for(int i = 0; i<13; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(WestRunComplex).title("West Run Complex").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(GlenMarkBonVista).title("Glenmark & BonVista").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(SuncrestTownCentre).title("Suncrest Town Centre").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(ChestnutRidge).title("Chestnut Ridge").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(StewartPlaceLewisStreet).title("Stewart Place & Lewis Street").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(ShortyAndersons).title("Short Anderson's").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(HoffmanVanGuilder).title("Hoffman/Van Guilder").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(ExpressMart).title("Express Mart").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 8) {
                        marker = mMap.addMarker(new MarkerOptions().position(StewartUniversity).title("Stewart & University").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 9) {
                        marker = mMap.addMarker(new MarkerOptions().position(CopperBeech).title("Copper Beech").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 10) {
                        marker = mMap.addMarker(new MarkerOptions().position(Mountainlair).title("Mountainlair").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 11) {
                        marker = mMap.addMarker(new MarkerOptions().position(CourtHouse).title("Court House").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 12) {
                        marker = mMap.addMarker(new MarkerOptions().position(PublicSafetyBuilding).title("Public Safety Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 16:
                for(int i = 0; i<11; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(TowersPRT).title("Towers PRT").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(Towers).title("Towers").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(Oakland).title("Oakland").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(LawSchool).title("Law School").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(GrantAtFourth).title("Grant Ave.").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(LifeSciences).title("Life Sciences Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(Beechurst).title("Beechurst Ave.").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 7) {
                        marker = mMap.addMarker(new MarkerOptions().position(CAC).title("Creative Arts Center").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 8) {
                        marker = mMap.addMarker(new MarkerOptions().position(EngineeringPRT).title("Engineering PRT").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 9) {
                        marker = mMap.addMarker(new MarkerOptions().position(EvansdaleLibrary).title("Evansdale Library").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 10) {
                        marker = mMap.addMarker(new MarkerOptions().position(AllenHall).title("Allen Hall").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
            case 17:
                for(int i = 0; i<7; i++) {
                    if (i == 0) {
                        marker = mMap.addMarker(new MarkerOptions().position(ValleyView).title("Valley View").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 1) {
                        marker = mMap.addMarker(new MarkerOptions().position(ChestnutRidge).title("Chestnut Ridge").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 2) {
                        marker = mMap.addMarker(new MarkerOptions().position(StewartstownRoad).title("Stewartstown Road").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 3) {
                        marker = mMap.addMarker(new MarkerOptions().position(FallingRun).title("Falling Run").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 4) {
                        marker = mMap.addMarker(new MarkerOptions().position(LifesciencesBNE).title("Life Sciences/B&E").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 5) {
                        marker = mMap.addMarker(new MarkerOptions().position(StewartST).title("Stewarts Street").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                    if (i == 6) {
                        marker = mMap.addMarker(new MarkerOptions().position(Willowdale).title("Willowdale").icon(BitmapDescriptorFactory.fromResource(R.drawable.busstop)));
                        markers.add(marker);
                    }
                }
                break;
        }
    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.bloc_1:
                moveToMarker(0);
                break;
            case R.id.bloc_2:
                moveToMarker(1);
                break;
            case R.id.bloc_3:
                moveToMarker(2);
                break;
            case R.id.bloc_4:
                moveToMarker(3);
                break;
            case R.id.bloc_5:
                moveToMarker(4);
                break;
            case R.id.bloc_6:
                moveToMarker(5);
                break;
            case R.id.bloc_7:
                moveToMarker(6);
                break;
            case R.id.bloc_8:
                moveToMarker(7);
                break;
            case R.id.bloc_9:
                moveToMarker(8);
                break;
            case R.id.bloc_10:
                moveToMarker(9);
                break;
            case R.id.bloc_11:
                moveToMarker(10);
                break;
            case R.id.bloc_12:
                moveToMarker(11);
                break;
            case R.id.bloc_13:
                moveToMarker(12);
                break;
            case R.id.bloc_14:
                moveToMarker(13);
                break;
            case R.id.bloc_15:
                moveToMarker(14);
                break;
            case R.id.bloc_16:
                moveToMarker(15);
                break;
        }
    }

    public void moveToMarker(int loc)
    {
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(markers.get(loc).getPosition(), 13));
    }

    private void setUpMapIfNeeded()
    {
        if(mMap == null)
        {
            mMap = ((MapView) findViewById(R.id.b_map)).getMap();
            if(mMap!= null)
            {
                setUpMap();
            }
        }
    }

    private void setUpMap()
    {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(39.6424938, -79.9515335), 12));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        mMapView.onDestroy();
        super.onDestroy();
        markers.clear();
    }
}
