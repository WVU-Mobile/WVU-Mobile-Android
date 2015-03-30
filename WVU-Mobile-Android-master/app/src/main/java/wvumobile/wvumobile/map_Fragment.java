package wvumobile.wvumobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableRow;
import java.util.ArrayList;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;



public class map_Fragment extends android.support.v4.app.Fragment implements  View.OnClickListener
{
    private MapView mMapView;
    private GoogleMap mMap;
    private Bundle mBundle;
    private static ArrayList<Marker> markers = new ArrayList<Marker>() ;


    //Building Rows
    private Button MapSelect;
    private Button BuildingSelect;
    private TableRow MapRow;
    private TableRow TitleRow;
    private TableRow AELRow;
    private TableRow AGSRow;
    private TableRow ALHRow;
    private TableRow ARHRow;
    private TableRow ARMRow;
    private TableRow ARNRow;
    private TableRow ASARow;
    private TableRow BICRow;
    private TableRow BKHRow;
    private TableRow BMRFRow;
    private TableRow BRFRow;
    private TableRow BRNRow;
    private TableRow BRSRow;
    private TableRow BRTRow;
    private TableRow BTTRow;
    private TableRow BUERow;
    private TableRow BXTRow;
    private TableRow CACRow;
    private TableRow CHIRow;
    private TableRow CKHRow;
    private TableRow CLNRow;
    private TableRow COLRow;
    private TableRow CS1Row;
    private TableRow CS2Row;
    private TableRow CS3Row;
    private TableRow CSGRow;
    private TableRow CP0Row;
    private TableRow CP1Row;
    private TableRow CP2Row;
    private TableRow CP3Row;
    private TableRow CP4Row;
    private TableRow CP5Row;
    private TableRow CP6Row;
    private TableRow CP7Row;
    private TableRow CP8Row;
    private TableRow CP9Row;
    private TableRow CRLRow;
    private TableRow CRPRow;
    private TableRow CRRRow;
    private TableRow DADRow;
    private TableRow EIERow;
    private TableRow EMHRow;
    private TableRow ERARow;
    private TableRow ERBRow;
    private TableRow ESBRow;
    private TableRow EVLRow;
    private TableRow EXTRow;
    private TableRow FAARow;
    private TableRow FABRow;
    private TableRow FCHRow;
    private TableRow FH1Row;
    private TableRow FH2Row;
    private TableRow FH3Row;
    private TableRow FH4Row;
    private TableRow FH5Row;
    private TableRow FH6Row;
    private TableRow FRMRow;
    private TableRow GRHRow;
    private TableRow GSKRow;
    private TableRow HODRow;
    private TableRow HONRow;
    private TableRow HSARow;
    private TableRow HSNRow;
    private TableRow HSSRow;
    private TableRow KNPRow;
    private TableRow LIBRow;
    private TableRow LNCRow;
    private TableRow LSBRow;
    private TableRow LWCRow;
    private TableRow LYTRow;
    private TableRow MARRow;
    private TableRow MBRCRow;
    private TableRow MCARow;
    private TableRow MCBRow;
    private TableRow MCJRow;
    private TableRow MCKRow;
    private TableRow MECRow;
    private TableRow MHHRow;
    private TableRow MRBRow;
    private TableRow MTLRow;
    private TableRow NATRow;
    private TableRow NDLRow;
    private TableRow NIORow;
    private TableRow NRCRow;
    private TableRow NSHRow;
    private TableRow NURRow;
    private TableRow OGHRow;
    private TableRow OWPRow;
    private TableRow PASRow;
    private TableRow PERRow;
    private TableRow PSKRow;
    private TableRow PURRow;
    private TableRow SRCRow;
    private TableRow RRIRow;
    private TableRow SASRow;
    private TableRow SLGRow;
    private TableRow SMTRow;
    private TableRow SPHRow;
    private TableRow SSCRow;
    private TableRow STARow;
    private TableRow STLRow;
    private TableRow SUMRow;
    private TableRow SMNRow;
    private TableRow STHRow;
    private TableRow TMPRow;
    private TableRow USCRow;
    private TableRow VNBRow;
    private TableRow VNGRow;
    private TableRow WDBRow;
    private TableRow WHIRow;
    private TableRow WRSRow;
    private TableRow RegistryRow;

    //Latitude/Longitude Objects for each building
    private LatLng AELlatlon = new LatLng(39.645670, -79.974281);
    private LatLng AGSlatlon = new LatLng(39.645768,-79.969936);
    private LatLng ALHlatlon = new LatLng(39.646186,-79.967245);
    private LatLng ARHlatlon = new LatLng(39.632486,-79.950469);
    private LatLng ARMlatlon = new LatLng(39.635020,-79.955750);
    private LatLng ARNlatlon = new LatLng(39.632126,-79.950727);
    private LatLng ASAlatlon = new LatLng(39.645670, -79.974281);
    private LatLng BIClatlon = new LatLng(39.645670, -79.974281);
    private LatLng BKHlatlon = new LatLng(39.645670, -79.974281);
    private LatLng BMRFlatlon = new LatLng(39.645670, -79.974281);
    private LatLng BRFlatlon = new LatLng(39.645670, -79.974281);
    private LatLng BRNlatlon = new LatLng(39.645670, -79.974281);
    private LatLng BRSlatlon = new LatLng(39.645670, -79.974281);
    private LatLng BRTlatlon = new LatLng(39.645670, -79.974281);
    private LatLng BTTlatlon = new LatLng(39.645670, -79.974281);
    private LatLng BUElatlon = new LatLng(39.645670, -79.974281);
    private LatLng BXTlatlon = new LatLng(39.645670, -79.974281);
    private LatLng CAClatlon = new LatLng(39.645670, -79.974281);
    private LatLng CHIlatlon = new LatLng(39.645670, -79.974281);
    private LatLng CKHlatlon = new LatLng(39.645670, -79.974281);
    private LatLng CLNlatlon = new LatLng(39.645670, -79.974281);
    private LatLng COLlatlon = new LatLng(39.645670, -79.974281);
    private LatLng CS1latlon = new LatLng(39.645670, -79.974281);
    private LatLng CS2latlon = new LatLng(39.645670, -79.974281);
    private LatLng CS3latlon = new LatLng(39.645670, -79.974281);
    private LatLng CSGlatlon = new LatLng(39.645670, -79.974281);
    private LatLng CP0latlon = new LatLng(39.645670, -79.974281);
    private LatLng CP1latlon = new LatLng(39.645670, -79.974281);
    private LatLng CP2latlon = new LatLng(39.645670, -79.974281);
    private LatLng CP3latlon = new LatLng(39.645670, -79.974281);
    private LatLng CP4latlon = new LatLng(39.645670, -79.974281);
    private LatLng CP5latlon = new LatLng(39.645670, -79.974281);
    private LatLng CP6latlon = new LatLng(39.645670, -79.974281);
    private LatLng CP7latlon = new LatLng(39.645670, -79.974281);
    private LatLng CP8latlon = new LatLng(39.645670, -79.974281);
    private LatLng CP9latlon = new LatLng(39.645670, -79.974281);
    private LatLng CRLlatlon = new LatLng(39.645670, -79.974281);
    private LatLng CRPlatlon = new LatLng(39.645670, -79.974281);
    private LatLng CRRlatlon = new LatLng(39.645670, -79.974281);
    private LatLng DADlatlon = new LatLng(39.645670, -79.974281);
    private LatLng EIElatlon = new LatLng(39.645670, -79.974281);
    private LatLng EMHlatlon = new LatLng(39.645670, -79.974281);
    private LatLng ERAlatlon = new LatLng(39.645670, -79.974281);
    private LatLng ERBlatlon = new LatLng(39.645670, -79.974281);
    private LatLng ESBlatlon = new LatLng(39.645670, -79.974281);
    private LatLng EVLlatlon = new LatLng(39.645670, -79.974281);
    private LatLng EXTlatlon = new LatLng(39.645670, -79.974281);
    private LatLng FAAlatlon = new LatLng(39.645670, -79.974281);
    private LatLng FABlatlon = new LatLng(39.645670, -79.974281);
    private LatLng FCHlatlon = new LatLng(39.645670, -79.974281);
    private LatLng FH1latlon = new LatLng(39.645670, -79.974281);
    private LatLng FH2latlon = new LatLng(39.645670, -79.974281);
    private LatLng FH3latlon = new LatLng(39.645670, -79.974281);
    private LatLng FH4latlon = new LatLng(39.645670, -79.974281);
    private LatLng FH5latlon = new LatLng(39.645670, -79.974281);
    private LatLng FH6latlon = new LatLng(39.645670, -79.974281);
    private LatLng FRMlatlon = new LatLng(39.645670, -79.974281);
    private LatLng GRHlatlon = new LatLng(39.645670, -79.974281);
    private LatLng GSKlatlon = new LatLng(39.645670, -79.974281);
    private LatLng HODlatlon = new LatLng(39.645670, -79.974281);
    private LatLng HONlatlon = new LatLng(39.645670, -79.974281);
    private LatLng HSAlatlon = new LatLng(39.645670, -79.974281);
    private LatLng HSNlatlon = new LatLng(39.645670, -79.974281);
    private LatLng HSSlatlon = new LatLng(39.645670, -79.974281);
    private LatLng KNPlatlon = new LatLng(39.645670, -79.974281);
    private LatLng LIBlatlon = new LatLng(39.645670, -79.974281);
    private LatLng LNClatlon = new LatLng(39.645670, -79.974281);
    private LatLng LSBlatlon = new LatLng(39.645670, -79.974281);
    private LatLng LWClatlon = new LatLng(39.645670, -79.974281);
    private LatLng LYTlatlon = new LatLng(39.645670, -79.974281);
    private LatLng MARlatlon = new LatLng(39.645670, -79.974281);
    private LatLng MBRClatlon = new LatLng(39.645670, -79.974281);
    private LatLng MCAlatlon = new LatLng(39.645670, -79.974281);
    private LatLng MCBlatlon = new LatLng(39.645670, -79.974281);
    private LatLng MCJlatlon = new LatLng(39.645670, -79.974281);
    private LatLng MCKlatlon = new LatLng(39.645670, -79.974281);
    private LatLng MEClatlon = new LatLng(39.645670, -79.974281);
    private LatLng MHHlatlon = new LatLng(39.645670, -79.974281);
    private LatLng MRBlatlon = new LatLng(39.645670, -79.974281);
    private LatLng MTLlatlon = new LatLng(39.634769,-79.953585);
    private LatLng NATlatlon = new LatLng(39.645670, -79.974281);
    private LatLng NDLlatlon = new LatLng(39.645670, -79.974281);
    private LatLng NIOlatlon = new LatLng(39.645670, -79.974281);
    private LatLng NRClatlon = new LatLng(39.645670, -79.974281);
    private LatLng NSHlatlon = new LatLng(39.645670, -79.974281);
    private LatLng NURlatlon = new LatLng(39.645670, -79.974281);
    private LatLng OGHlatlon = new LatLng(39.645670, -79.974281);
    private LatLng OWPlatlon = new LatLng(39.645670, -79.974281);
    private LatLng PASlatlon = new LatLng(39.645670, -79.974281);
    private LatLng PERlatlon = new LatLng(39.645670, -79.974281);
    private LatLng PSKlatlon = new LatLng(39.645670, -79.974281);
    private LatLng PURlatlon = new LatLng(39.645670, -79.974281);
    private LatLng SRClatlon = new LatLng(39.645670, -79.974281);
    private LatLng RRIlatlon = new LatLng(39.645670, -79.974281);
    private LatLng SASlatlon = new LatLng(39.645670, -79.974281);
    private LatLng SLGlatlon = new LatLng(39.645670, -79.974281);
    private LatLng SMTlatlon = new LatLng(39.645670, -79.974281);
    private LatLng SPHlatlon = new LatLng(39.645670, -79.974281);
    private LatLng SSClatlon = new LatLng(39.645670, -79.974281);
    private LatLng STAlatlon = new LatLng(39.645670, -79.974281);
    private LatLng STLlatlon = new LatLng(39.645670, -79.974281);
    private LatLng SUMlatlon = new LatLng(39.645670, -79.974281);
    private LatLng SMNlatlon = new LatLng(39.645670, -79.974281);
    private LatLng STHlatlon = new LatLng(39.645670, -79.974281);
    private LatLng TMPlatlon = new LatLng(39.645670, -79.974281);
    private LatLng USClatlon = new LatLng(39.645670, -79.974281);
    private LatLng VNBlatlon = new LatLng(39.645670, -79.974281);
    private LatLng VNGlatlon = new LatLng(39.645670, -79.974281);
    private LatLng WDBlatlon = new LatLng(39.645670, -79.974281);
    private LatLng WHIlatlon = new LatLng(39.645670, -79.974281);
    private LatLng WRSlatlon = new LatLng(39.645670, -79.974281);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.map_layout, container, false);
        /*try
        {*/
            MapsInitializer.initialize(getActivity());
        /*}
        catch(GooglePlayServicesNotAvailableException e)
        {
            //do something
        }*/
        mMapView = (MapView) rootView.findViewById(R.id.WVUmap);
        mMapView.onCreate(mBundle);

        MapSelect = (Button) rootView.findViewById(R.id.map_mapButton);
        MapSelect.setOnClickListener(this);
        BuildingSelect = (Button) rootView.findViewById(R.id.map_buildingButton);
        BuildingSelect.setOnClickListener(this);
        MapRow = (TableRow) rootView.findViewById(R.id.mapRow);
        TitleRow = (TableRow) rootView.findViewById(R.id.locationTitles);
        TitleRow.setVisibility(View.GONE);
        AELRow = (TableRow) rootView.findViewById(R.id.AEL);
        AELRow.setOnClickListener(this);
        AELRow.setVisibility(View.GONE);
        AGSRow = (TableRow) rootView.findViewById(R.id.AGS);
        AGSRow.setOnClickListener(this);
        AGSRow.setVisibility(View.GONE);
        ALHRow = (TableRow) rootView.findViewById(R.id.ALH);
        ALHRow.setOnClickListener(this);
        ALHRow.setVisibility(View.GONE);
        ARHRow = (TableRow) rootView.findViewById(R.id.ARH);
        ARHRow.setOnClickListener(this);
        ARHRow.setVisibility(View.GONE);
        ARMRow = (TableRow) rootView.findViewById(R.id.ARM);
        ARMRow.setOnClickListener(this);
        ARMRow.setVisibility(View.GONE);
        ARNRow = (TableRow) rootView.findViewById(R.id.ARN);
        ARNRow.setOnClickListener(this);
        ARNRow.setVisibility(View.GONE);
        ASARow = (TableRow) rootView.findViewById(R.id.ASA);
        ASARow.setOnClickListener(this);
        ASARow.setVisibility(View.GONE);
        BICRow = (TableRow) rootView.findViewById(R.id.BIC);
        BICRow.setOnClickListener(this);
        BICRow.setVisibility(View.GONE);
        BKHRow = (TableRow) rootView.findViewById(R.id.BKH);
        BKHRow.setOnClickListener(this);
        BKHRow.setVisibility(View.GONE);
        BMRFRow = (TableRow) rootView.findViewById(R.id.BMRF);
        BMRFRow.setOnClickListener(this);
        BMRFRow.setVisibility(View.GONE);
        BRFRow = (TableRow) rootView.findViewById(R.id.BRF);
        BRFRow.setOnClickListener(this);
        BRFRow.setVisibility(View.GONE);
        BRNRow = (TableRow) rootView.findViewById(R.id.BRN);
        BRNRow.setOnClickListener(this);
        BRNRow.setVisibility(View.GONE);
        BRSRow = (TableRow) rootView.findViewById(R.id.BRS);
        BRSRow.setOnClickListener(this);
        BRSRow.setVisibility(View.GONE);
        BRTRow = (TableRow) rootView.findViewById(R.id.BRT);
        BRTRow.setOnClickListener(this);
        BRTRow.setVisibility(View.GONE);
        BTTRow = (TableRow) rootView.findViewById(R.id.BTT);
        BTTRow.setOnClickListener(this);
        BTTRow.setVisibility(View.GONE);
        BUERow = (TableRow) rootView.findViewById(R.id.BUE);
        BUERow.setOnClickListener(this);
        BUERow.setVisibility(View.GONE);
        BXTRow = (TableRow) rootView.findViewById(R.id.BXT);
        BXTRow.setOnClickListener(this);
        BXTRow.setVisibility(View.GONE);
        CACRow = (TableRow) rootView.findViewById(R.id.CAC);
        CACRow.setOnClickListener(this);
        CACRow.setVisibility(View.GONE);
        CHIRow = (TableRow) rootView.findViewById(R.id.CHI);
        CHIRow.setOnClickListener(this);
        CHIRow.setVisibility(View.GONE);
        CKHRow = (TableRow) rootView.findViewById(R.id.CKH);
        CKHRow.setOnClickListener(this);
        CKHRow.setVisibility(View.GONE);
        CLNRow = (TableRow) rootView.findViewById(R.id.CLN);
        CLNRow.setOnClickListener(this);
        CLNRow.setVisibility(View.GONE);
        COLRow = (TableRow) rootView.findViewById(R.id.COL);
        COLRow.setOnClickListener(this);
        COLRow.setVisibility(View.GONE);
        CS1Row = (TableRow) rootView.findViewById(R.id.CS1);
        CS1Row.setOnClickListener(this);
        CS1Row.setVisibility(View.GONE);
        CS2Row = (TableRow) rootView.findViewById(R.id.CS2);
        CS2Row.setOnClickListener(this);
        CS2Row.setVisibility(View.GONE);
        CS3Row = (TableRow) rootView.findViewById(R.id.CS3);
        CS3Row.setOnClickListener(this);
        CS3Row.setVisibility(View.GONE);
        CSGRow = (TableRow) rootView.findViewById(R.id.CSG);
        CSGRow.setOnClickListener(this);
        CSGRow.setVisibility(View.GONE);
        CP0Row = (TableRow) rootView.findViewById(R.id.CP0);
        CP0Row.setOnClickListener(this);
        CP0Row.setVisibility(View.GONE);
        CP1Row = (TableRow) rootView.findViewById(R.id.CP1);
        CP1Row.setOnClickListener(this);
        CP1Row.setVisibility(View.GONE);
        CP2Row = (TableRow) rootView.findViewById(R.id.CP2);
        CP2Row.setOnClickListener(this);
        CP2Row.setVisibility(View.GONE);
        CP3Row = (TableRow) rootView.findViewById(R.id.CP3);
        CP3Row.setOnClickListener(this);
        CP3Row.setVisibility(View.GONE);
        CP4Row = (TableRow) rootView.findViewById(R.id.CP4);
        CP4Row.setOnClickListener(this);
        CP4Row.setVisibility(View.GONE);
        CP5Row = (TableRow) rootView.findViewById(R.id.CP5);
        CP5Row.setOnClickListener(this);
        CP5Row.setVisibility(View.GONE);
        CP6Row = (TableRow) rootView.findViewById(R.id.CP6);
        CP6Row.setOnClickListener(this);
        CP6Row.setVisibility(View.GONE);
        CP7Row = (TableRow) rootView.findViewById(R.id.CP7);
        CP7Row.setOnClickListener(this);
        CP7Row.setVisibility(View.GONE);
        CP8Row = (TableRow) rootView.findViewById(R.id.CP8);
        CP8Row.setOnClickListener(this);
        CP8Row.setVisibility(View.GONE);
        CP9Row = (TableRow) rootView.findViewById(R.id.CP9);
        CP9Row.setOnClickListener(this);
        CP9Row.setVisibility(View.GONE);
        CRLRow = (TableRow) rootView.findViewById(R.id.CRL);
        CRLRow.setOnClickListener(this);
        CRLRow.setVisibility(View.GONE);
        CRPRow = (TableRow) rootView.findViewById(R.id.CRP);
        CRPRow.setOnClickListener(this);
        CRPRow.setVisibility(View.GONE);
        CRRRow = (TableRow) rootView.findViewById(R.id.CRR);
        CRRRow.setOnClickListener(this);
        CRRRow.setVisibility(View.GONE);
        DADRow = (TableRow) rootView.findViewById(R.id.DAD);
        DADRow.setOnClickListener(this);
        DADRow.setVisibility(View.GONE);
        EIERow = (TableRow) rootView.findViewById(R.id.EIE);
        EIERow.setOnClickListener(this);
        EIERow.setVisibility(View.GONE);
        EMHRow = (TableRow) rootView.findViewById(R.id.EMH);
        EMHRow.setOnClickListener(this);
        EMHRow.setVisibility(View.GONE);
        ERARow = (TableRow) rootView.findViewById(R.id.ERA);
        ERARow.setOnClickListener(this);
        ERARow.setVisibility(View.GONE);
        ERBRow = (TableRow) rootView.findViewById(R.id.ERB);
        ERBRow.setOnClickListener(this);
        ERBRow.setVisibility(View.GONE);
        ESBRow = (TableRow) rootView.findViewById(R.id.ESB);
        ESBRow.setOnClickListener(this);
        ESBRow.setVisibility(View.GONE);
        EVLRow = (TableRow) rootView.findViewById(R.id.EVL);
        EVLRow.setOnClickListener(this);
        EVLRow.setVisibility(View.GONE);
        EXTRow = (TableRow) rootView.findViewById(R.id.EXT);
        EXTRow.setOnClickListener(this);
        EXTRow.setVisibility(View.GONE);
        FAARow = (TableRow) rootView.findViewById(R.id.FAA);
        FAARow.setOnClickListener(this);
        FAARow.setVisibility(View.GONE);
        FABRow = (TableRow) rootView.findViewById(R.id.FAB);
        FABRow.setOnClickListener(this);
        FABRow.setVisibility(View.GONE);
        FCHRow = (TableRow) rootView.findViewById(R.id.FCH);
        FCHRow.setOnClickListener(this);
        FCHRow.setVisibility(View.GONE);
        FH1Row = (TableRow) rootView.findViewById(R.id.FH1);
        FH1Row.setOnClickListener(this);
        FH1Row.setVisibility(View.GONE);
        FH2Row = (TableRow) rootView.findViewById(R.id.FH2);
        FH2Row.setOnClickListener(this);
        FH2Row.setVisibility(View.GONE);
        FH3Row = (TableRow) rootView.findViewById(R.id.FH3);
        FH3Row.setOnClickListener(this);
        FH3Row.setVisibility(View.GONE);
        FH4Row = (TableRow) rootView.findViewById(R.id.FH4);
        FH4Row.setOnClickListener(this);
        FH4Row.setVisibility(View.GONE);
        FH5Row = (TableRow) rootView.findViewById(R.id.FH5);
        FH5Row.setOnClickListener(this);
        FH5Row.setVisibility(View.GONE);
        FH6Row = (TableRow) rootView.findViewById(R.id.FH6);
        FH6Row.setOnClickListener(this);
        FH6Row.setVisibility(View.GONE);
        FRMRow = (TableRow) rootView.findViewById(R.id.FRM);
        FRMRow.setOnClickListener(this);
        FRMRow.setVisibility(View.GONE);
        GRHRow = (TableRow) rootView.findViewById(R.id.GRH);
        GRHRow.setOnClickListener(this);
        GRHRow.setVisibility(View.GONE);
        GSKRow = (TableRow) rootView.findViewById(R.id.GSK);
        GSKRow.setOnClickListener(this);
        GSKRow.setVisibility(View.GONE);
        HODRow = (TableRow) rootView.findViewById(R.id.HOD);
        HODRow.setOnClickListener(this);
        HODRow.setVisibility(View.GONE);
        HONRow = (TableRow) rootView.findViewById(R.id.HON);
        HONRow.setOnClickListener(this);
        HONRow.setVisibility(View.GONE);
        HSARow = (TableRow) rootView.findViewById(R.id.HSA);
        HSARow.setOnClickListener(this);
        HSARow.setVisibility(View.GONE);
        HSNRow = (TableRow) rootView.findViewById(R.id.HSN);
        HSNRow.setOnClickListener(this);
        HSNRow.setVisibility(View.GONE);
        HSSRow = (TableRow) rootView.findViewById(R.id.HSS);
        HSSRow.setOnClickListener(this);
        HSSRow.setVisibility(View.GONE);
        KNPRow = (TableRow) rootView.findViewById(R.id.KNP);
        KNPRow.setOnClickListener(this);
        KNPRow.setVisibility(View.GONE);
        LIBRow = (TableRow) rootView.findViewById(R.id.LIB);
        LIBRow.setOnClickListener(this);
        LIBRow.setVisibility(View.GONE);
        LNCRow = (TableRow) rootView.findViewById(R.id.LNC);
        LNCRow.setOnClickListener(this);
        LNCRow.setVisibility(View.GONE);
        LSBRow = (TableRow) rootView.findViewById(R.id.LSB);
        LSBRow.setOnClickListener(this);
        LSBRow.setVisibility(View.GONE);
        LWCRow = (TableRow) rootView.findViewById(R.id.LWC);
        LWCRow.setOnClickListener(this);
        LWCRow.setVisibility(View.GONE);
        LYTRow = (TableRow) rootView.findViewById(R.id.LYT);
        LYTRow.setOnClickListener(this);
        LYTRow.setVisibility(View.GONE);
        MARRow = (TableRow) rootView.findViewById(R.id.MAR);
        MARRow.setOnClickListener(this);
        MARRow.setVisibility(View.GONE);
        MBRCRow = (TableRow) rootView.findViewById(R.id.MBRC);
        MBRCRow.setOnClickListener(this);
        MBRCRow.setVisibility(View.GONE);
        MCARow = (TableRow) rootView.findViewById(R.id.MCA);
        MCARow.setOnClickListener(this);
        MCARow.setVisibility(View.GONE);
        MCBRow = (TableRow) rootView.findViewById(R.id.MCB);
        MCBRow.setOnClickListener(this);
        MCBRow.setVisibility(View.GONE);
        MCJRow = (TableRow) rootView.findViewById(R.id.MCJ);
        MCJRow.setOnClickListener(this);
        MCJRow.setVisibility(View.GONE);
        MCKRow = (TableRow) rootView.findViewById(R.id.MCK);
        MCKRow.setOnClickListener(this);
        MCKRow.setVisibility(View.GONE);
        MECRow = (TableRow) rootView.findViewById(R.id.MEC);
        MECRow.setOnClickListener(this);
        MECRow.setVisibility(View.GONE);
        MHHRow = (TableRow) rootView.findViewById(R.id.MHH);
        MHHRow.setOnClickListener(this);
        MHHRow.setVisibility(View.GONE);
        MRBRow = (TableRow) rootView.findViewById(R.id.MRB);
        MRBRow.setOnClickListener(this);
        MRBRow.setVisibility(View.GONE);
        MTLRow = (TableRow) rootView.findViewById(R.id.MTL);
        MTLRow.setOnClickListener(this);
        MTLRow.setVisibility(View.GONE);
        NATRow = (TableRow) rootView.findViewById(R.id.NAT);
        NATRow.setOnClickListener(this);
        NATRow.setVisibility(View.GONE);
        NDLRow = (TableRow) rootView.findViewById(R.id.NDL);
        NDLRow.setOnClickListener(this);
        NDLRow.setVisibility(View.GONE);
        NIORow = (TableRow) rootView.findViewById(R.id.NIO);
        NIORow.setOnClickListener(this);
        NIORow.setVisibility(View.GONE);
        NRCRow = (TableRow) rootView.findViewById(R.id.NRC);
        NRCRow.setOnClickListener(this);
        NRCRow.setVisibility(View.GONE);
        NSHRow = (TableRow) rootView.findViewById(R.id.NSH);
        NSHRow.setOnClickListener(this);
        NSHRow.setVisibility(View.GONE);
        NURRow = (TableRow) rootView.findViewById(R.id.NUR);
        NURRow.setOnClickListener(this);
        NURRow.setVisibility(View.GONE);
        OGHRow = (TableRow) rootView.findViewById(R.id.OGH);
        OGHRow.setOnClickListener(this);
        OGHRow.setVisibility(View.GONE);
        OWPRow = (TableRow) rootView.findViewById(R.id.OWP);
        OWPRow.setOnClickListener(this);
        OWPRow.setVisibility(View.GONE);
        PASRow = (TableRow) rootView.findViewById(R.id.PAS);
        PASRow.setOnClickListener(this);
        PASRow.setVisibility(View.GONE);
        PERRow = (TableRow) rootView.findViewById(R.id.PER);
        PERRow.setOnClickListener(this);
        PERRow.setVisibility(View.GONE);
        PSKRow = (TableRow) rootView.findViewById(R.id.PSK);
        PSKRow.setOnClickListener(this);
        PSKRow.setVisibility(View.GONE);
        PURRow = (TableRow) rootView.findViewById(R.id.PUR);
        PURRow.setOnClickListener(this);
        PURRow.setVisibility(View.GONE);
        SRCRow = (TableRow) rootView.findViewById(R.id.SRC);
        SRCRow.setOnClickListener(this);
        SRCRow.setVisibility(View.GONE);
        RRIRow = (TableRow) rootView.findViewById(R.id.RRI);
        RRIRow.setOnClickListener(this);
        RRIRow.setVisibility(View.GONE);
        SASRow = (TableRow) rootView.findViewById(R.id.SAS);
        SASRow.setOnClickListener(this);
        SASRow.setVisibility(View.GONE);
        SLGRow = (TableRow) rootView.findViewById(R.id.SLG);
        SLGRow.setOnClickListener(this);
        SLGRow.setVisibility(View.GONE);
        SMTRow = (TableRow) rootView.findViewById(R.id.SMT);
        SMTRow.setOnClickListener(this);
        SMTRow.setVisibility(View.GONE);
        SPHRow = (TableRow) rootView.findViewById(R.id.SPH);
        SPHRow.setOnClickListener(this);
        SPHRow.setVisibility(View.GONE);
        SSCRow = (TableRow) rootView.findViewById(R.id.SSC);
        SSCRow.setOnClickListener(this);
        SSCRow.setVisibility(View.GONE);
        STARow = (TableRow) rootView.findViewById(R.id.STA);
        STARow.setOnClickListener(this);
        STARow.setVisibility(View.GONE);
        STLRow = (TableRow) rootView.findViewById(R.id.STL);
        STLRow.setOnClickListener(this);
        STLRow.setVisibility(View.GONE);
        SUMRow = (TableRow) rootView.findViewById(R.id.SUM);
        SUMRow.setOnClickListener(this);
        SUMRow.setVisibility(View.GONE);
        SMNRow = (TableRow) rootView.findViewById(R.id.SMN);
        SMNRow.setOnClickListener(this);
        SMNRow.setVisibility(View.GONE);
        STHRow = (TableRow) rootView.findViewById(R.id.STH);
        STHRow.setOnClickListener(this);
        STHRow.setVisibility(View.GONE);
        TMPRow = (TableRow) rootView.findViewById(R.id.TMP);
        TMPRow.setOnClickListener(this);
        TMPRow.setVisibility(View.GONE);
        USCRow = (TableRow) rootView.findViewById(R.id.USC);
        USCRow.setOnClickListener(this);
        USCRow.setVisibility(View.GONE);
        VNBRow = (TableRow) rootView.findViewById(R.id.VNB);
        VNBRow.setOnClickListener(this);
        VNBRow.setVisibility(View.GONE);
        VNGRow = (TableRow) rootView.findViewById(R.id.VNG);
        VNGRow.setOnClickListener(this);
        VNGRow.setVisibility(View.GONE);
        WDBRow = (TableRow) rootView.findViewById(R.id.WDB);
        WDBRow.setOnClickListener(this);
        WDBRow.setVisibility(View.GONE);
        WHIRow = (TableRow) rootView.findViewById(R.id.WHI);
        WHIRow.setOnClickListener(this);
        WHIRow.setVisibility(View.GONE);
        WRSRow = (TableRow) rootView.findViewById(R.id.WRS);
        WRSRow.setOnClickListener(this);
        WRSRow.setVisibility(View.GONE);
        RegistryRow = (TableRow) rootView.findViewById(R.id.REGISTRY);
        RegistryRow.setVisibility(View.GONE);

        setUpMapIfNeeded(rootView);
        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mBundle = savedInstanceState;
    }

    private void setUpMapIfNeeded(View rootView)
    {
        if(mMap == null)
        {
            mMap = ((MapView) rootView.findViewById(R.id.WVUmap)).getMap();
            if(mMap!= null)
            {
                setUpMap();
            }
        }
    }

    private void setUpMap()
    {

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(39.6359503, -79.9459544), 13));
        Marker marker = mMap.addMarker(new MarkerOptions().position(MTLlatlon).title("Mountainlair"));
        MTLRow.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray3));
        markers.add(marker);
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
    }

    public void onClick(View v)
    {
        Marker marker;

        switch(v.getId())
        {
            case R.id.map_mapButton:
                MapSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray2));
                BuildingSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray1));
                viewMap();
                break;
            case R.id.map_buildingButton:
                MapSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray1));
                BuildingSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray2));
                viewBuildings();
                break;
            case R.id.AEL:
                updateMarkers(AELlatlon,"Aerodynamics Laboratory", AELRow);
                break;
            case R.id.AGS:
                updateMarkers(AGSlatlon,"Agricultural Sciences Building", AGSRow);
                break;
            case R.id.ALH:
                updateMarkers(ALHlatlon,"Allen Hall", ALHRow);
                break;
            case R.id.ARH:
                updateMarkers(ARHlatlon,"Arnold Hall", ARHRow);
                break;
            case R.id.ARM:
                updateMarkers(ARMlatlon,"Armstrong Hall", ARMRow);
                break;
            case R.id.ARN:
                updateMarkers(ARNlatlon,"Arnold Apartments", ARNRow);
                break;
            case R.id.ASA:
                updateMarkers(ASAlatlon,"Agricultural Sciences Annex", ASARow);
                break;
            case R.id.BIC:
                updateMarkers(BIClatlon,"Bicentennial House", BICRow);
                break;
            case R.id.BKH:
                updateMarkers(BKHlatlon,"Brooks Hall", BKHRow);
                break;
            case R.id.BMRF:
                updateMarkers(BMRFlatlon,"Biomedical Research Facility", BMRFRow);
                break;
            case R.id.BRF:
                updateMarkers(BRFlatlon,"Boreman Residential Facility", BRFRow);
                break;
            case R.id.BRN:
                updateMarkers(BRNlatlon,"Boreman Hall North", BRNRow);
                break;
            case R.id.BRS:
                updateMarkers(BRSlatlon,"Boreman Hall South", BRSRow);
                break;
            case R.id.BRT:
                updateMarkers(BRTlatlon,"Brooke Tower", BRTRow);
                break;
            case R.id.BTT:
                updateMarkers(BTTlatlon,"Benett Tower", BTTRow);
                break;
            case R.id.BUE:
                updateMarkers(BUElatlon,"Business & Economics Building", BUERow);
                break;
            case R.id.BXT:
                updateMarkers(BXTlatlon,"Braxton Tower", BXTRow);
                break;
            case R.id.CAC:
                updateMarkers(CAClatlon,"Creative Arts Center", CACRow);
                break;
            case R.id.CHI:
                updateMarkers(CHIlatlon,"Chitwood Hall", CHIRow);
                break;
            case R.id.CKH:
                updateMarkers(CKHlatlon,"Clark Hall", CKHRow);
                break;
            case R.id.CLN:
                updateMarkers(CLNlatlon,"Colson Hall", CLNRow);
                break;
            case R.id.COL:
                updateMarkers(COLlatlon,"Coliseum", COLRow);
                break;
            case R.id.CS1:
                updateMarkers(CS1latlon,"Crime Scene House 1", CS1Row);
                break;
            case R.id.CS2:
                updateMarkers(CS2latlon,"Crime Scene House 2", CS2Row);
                break;
            case R.id.CS3:
                updateMarkers(CS3latlon,"Crime Scene House 3", CS3Row);
                break;
            case R.id.CSG:
                updateMarkers(CSGlatlon,"Crime Scene Garage", CSGRow);
                break;
            case R.id.CP0:
                updateMarkers(CP0latlon,"366 College Park Apartments", CP0Row);
                break;
            case R.id.CP1:
                updateMarkers(CP1latlon,"367 College Park Apartments", CP1Row);
                break;
            case R.id.CP2:
                updateMarkers(CP2latlon,"379 College Park Apartments", CP2Row);
                break;
            case R.id.CP3:
                updateMarkers(CP3latlon,"380 College Park Apartments", CP3Row);
                break;
            case R.id.CP4:
                updateMarkers(CP4latlon,"381 College Park Apartments", CP4Row);
                break;
            case R.id.CP5:
                updateMarkers(CP5latlon,"394 College Park Apartments", CP5Row);
                break;
            case R.id.CP6:
                updateMarkers(CP6latlon,"395 College Park Apartments", CP6Row);
                break;
            case R.id.CP7:
                updateMarkers(CP7latlon,"401 College Park Apartments", CP7Row);
                break;
            case R.id.CP8:
                updateMarkers(CP8latlon,"411 College Park Apartments", CP8Row);
                break;
            case R.id.CP9:
                updateMarkers(CP9latlon,"421 College Park Apartments", CP9Row);
                break;
            case R.id.CRL:
                updateMarkers(CRLlatlon,"Chemistry Research Laboratory", CRLRow);
                break;
            case R.id.CRP:
                updateMarkers(CRPlatlon,"Chestnut Ridge Professional Building", CRPRow);
                break;
            case R.id.CRR:
                updateMarkers(CRRlatlon,"Chestnut Ridge Research Building", CRRRow);
                break;
            case R.id.DAD:
                updateMarkers(DADlatlon,"Dadisman Hall", DADRow);
                break;
            case R.id.EIE:
                updateMarkers(EIElatlon,"Eisland Hall", EIERow);
                break;
            case R.id.EMH:
                updateMarkers(EMHlatlon,"Elizabeth Moore Hall", EMHRow);
                break;
            case R.id.ERA:
                updateMarkers(ERAlatlon,"ERC RFL Annex Office Building", ERARow);
                break;
            case R.id.ERB:
                updateMarkers(ERBlatlon,"Engineering Research Building", ERBRow);
                break;
            case R.id.ESB:
                updateMarkers(ESBlatlon,"Engineering Sciences Building", ESBRow);
                break;
            case R.id.EVL:
                updateMarkers(EVLlatlon,"Evansdale Library", EVLRow);
                break;
            case R.id.EXT:
                updateMarkers(EXTlatlon,"Pierpont Extended Hsg", EXTRow);
                break;
            case R.id.FAA:
                updateMarkers(FAAlatlon,"Faculty Apartment A", FAARow);
                break;
            case R.id.FAB:
                updateMarkers(FABlatlon,"Faculty Apartment B", FABRow);
                break;
            case R.id.FCH:
                updateMarkers(FCHlatlon,"Fieldcrest Hall", FCHRow);
                break;
            case R.id.FH1:
                updateMarkers(FH1latlon,"650 Spruce", FH1Row);
                break;
            case R.id.FH2:
                updateMarkers(FH2latlon,"660 North High", FH2Row);
                break;
            case R.id.FH3:
                updateMarkers(FH3latlon,"670 North High", FH3Row);
                break;
            case R.id.FH4:
                updateMarkers(FH4latlon,"672 North High", FH4Row);
                break;
            case R.id.FH5:
                updateMarkers(FH5latlon,"216 Belmar", FH5Row);
                break;
            case R.id.FH6:
                updateMarkers(FH6latlon,"225 Belmar", FH6Row);
                break;
            case R.id.FRM:
                updateMarkers(FRMlatlon,"Animal Sciences Farm", FRMRow);
                break;
            case R.id.GRH:
                updateMarkers(GRHlatlon,"Greenhouse 1", GRHRow);
                break;
            case R.id.GSK:
                updateMarkers(GSKlatlon,"Gaskins House", GSKRow);
                break;
            case R.id.HOD:
                updateMarkers(HODlatlon,"Hodges Hall", HODRow);
                break;
            case R.id.HON:
                updateMarkers(HONlatlon,"Honors Hall", HONRow);
                break;
            case R.id.HSA:
                updateMarkers(HSAlatlon,"Health Sciences Addition", HSARow);
                break;
            case R.id.HSN:
                updateMarkers(HSNlatlon,"Health Sciences North", HSNRow);
                break;
            case R.id.HSS:
                updateMarkers(HSSlatlon,"Health Sciences South", HSSRow);
                break;
            case R.id.KNP:
                updateMarkers(KNPlatlon,"Knapp Hall", KNPRow);
                break;
            case R.id.LIB:
                updateMarkers(LIBlatlon,"Charles C. Wise, Jr. Library", CP0Row);
                break;
            case R.id.LNC:
                updateMarkers(LNClatlon,"Lincoln Hall", LNCRow);
                break;
            case R.id.LSB:
                updateMarkers(LSBlatlon,"Life Sciences Building", LSBRow);
                break;
            case R.id.LWC:
                updateMarkers(LWClatlon,"Law Center", LWCRow);
                break;
            case R.id.LYT:
                updateMarkers(LYTlatlon,"Lyon Tower", LYTRow);
                break;
            case R.id.MAR:
                updateMarkers(MARlatlon,"Martin Hall", MARRow);
                break;
            case R.id.MBRC:
                updateMarkers(MBRClatlon,"Mary Babb Randolph Cancer Center", MBRCRow);
                break;
            case R.id.MCA:
                updateMarkers(MCAlatlon,"Medical Center Apartment Building K", MCARow);
                break;
            case R.id.MCB:
                updateMarkers(MCBlatlon,"Medical Center Apartment Building J", MCBRow);
                break;
            case R.id.MCJ:
                updateMarkers(MCJlatlon,"Med Center Apartment J", MCJRow);
                break;
            case R.id.MCK:
                updateMarkers(MCKlatlon,"Med Center Apartment K", MCKRow);
                break;
            case R.id.MEC:
                updateMarkers(MEClatlon,"Museum Education Center", MECRow);
                break;
            case R.id.MHH:
                updateMarkers(MHHlatlon,"Ming Hsieh Hall", MHHRow);
                break;
            case R.id.MRB:
                updateMarkers(MRBlatlon,"Mineral Resources Building", MRBRow);
                break;
            case R.id.MTL:
                updateMarkers(MTLlatlon,"Mountainlair", MTLRow);
                break;
            case R.id.NAT:
                updateMarkers(NATlatlon,"Natatorium - Shell", NATRow);
                break;
            case R.id.NDL:
                updateMarkers(NDLlatlon,"New Downtown Library", NDLRow);
                break;
            case R.id.NIO:
                updateMarkers(NIOlatlon,"NIOSH Building", NIORow);
                break;
            case R.id.NRC:
                updateMarkers(NRClatlon,"National Research Center", NRCRow);
                break;
            case R.id.NSH:
                updateMarkers(NSHlatlon,"North Street House", NSHRow);
                break;
            case R.id.NUR:
                updateMarkers(NURlatlon,"NURSERY SCHOOL", NURRow);
                break;
            case R.id.OGH:
                updateMarkers(OGHlatlon,"Oglebay Hall", OGHRow);
                break;
            case R.id.OWP:
                updateMarkers(OWPlatlon,"One Waterfront Place", OWPRow);
                break;
            case R.id.PAS:
                updateMarkers(PASlatlon,"CPASS Building", PASRow);
                break;
            case R.id.PER:
                updateMarkers(PERlatlon,"Percival Hall", PERRow);
                break;
            case R.id.PSK:
                updateMarkers(PSKlatlon,"Milan Puskar Center", PSKRow);
                break;
            case R.id.PUR:
                updateMarkers(PURlatlon,"Puritan House", PURRow);
                break;
            case R.id.SRC:
                updateMarkers(SRClatlon,"Student Recreation Center", SRCRow);
                break;
            case R.id.RRI:
                updateMarkers(RRIlatlon,"Regional Research Institute", RRIRow);
                break;
            case R.id.SAS:
                updateMarkers(SASlatlon,"South Agricultural Sciences", SASRow);
                break;
            case R.id.SLG:
                updateMarkers(SLGlatlon,"College Park - The Ridge", SLGRow);
                break;
            case R.id.SMT:
                updateMarkers(SMTlatlon,"Summit Hall", SMTRow);
                break;
            case R.id.SPH:
                updateMarkers(SPHlatlon,"International House", SPHRow);
                break;
            case R.id.SSC:
                updateMarkers(SSClatlon,"Student Services Center", SSCRow);
                break;
            case R.id.STA:
                updateMarkers(STAlatlon,"Stansbury Hall", STARow);
                break;
            case R.id.STL:
                updateMarkers(STLlatlon,"Stalnaker Hall", STLRow);
                break;
            case R.id.SUM:
                updateMarkers(SUMlatlon,"Summer School Housing Downtown", SUMRow);
                break;
            case R.id.SMN:
                updateMarkers(SMNlatlon,"Summer School Housing", SMNRow);
                break;
            case R.id.STH:
                updateMarkers(STHlatlon,"Student Health", STHRow);
                break;
            case R.id.TMP:
                updateMarkers(TMPlatlon,"Temporary Housing - Hotel", TMPRow);
                break;
            case R.id.USC:
                updateMarkers(USClatlon,"University Services Center", USCRow);
                break;
            case R.id.VNB:
                updateMarkers(VNBlatlon,"Vandalia Blue", VNBRow);
                break;
            case R.id.VNG:
                updateMarkers(VNGlatlon,"Vandalia Gold", VNGRow);
                break;
            case R.id.WDB:
                updateMarkers(WDBlatlon,"Woodburn Hall", WDBRow);
                break;
            case R.id.WHI:
                updateMarkers(WHIlatlon,"White Hall", WHIRow);
                break;
            case R.id.WRS:
                updateMarkers(WRSlatlon,"Wrestling Structure", WRSRow);
                break;
        }

    }

    public void updateMarkers(LatLng latlng, String title, TableRow row)
    {
        Marker marker;
        marker = mMap.addMarker(new MarkerOptions().position(latlng).title(title));
        if(checkMarker(marker))
        {
            row.setBackgroundColor(getResources().getColor(R.color.DarkestBlueColor));
            marker.remove();
        }
        else
        {
            row.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray3));
            markers.add(marker);
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng, 13));
            viewMap();
        }
    }

    public void viewMap()
    {
        //Updating Button Highlight
        MapSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray2));
        BuildingSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray1));

        //Making the Map Visible
        MapRow.setVisibility(View.VISIBLE);
        // Hiding Building Rows
        TitleRow.setVisibility(View.GONE);
        AELRow.setVisibility(View.GONE);
        AGSRow.setVisibility(View.GONE);
        ALHRow.setVisibility(View.GONE);
        ARHRow.setVisibility(View.GONE);
        ARMRow.setVisibility(View.GONE);
        ARNRow.setVisibility(View.GONE);
        ASARow.setVisibility(View.GONE);
        BICRow.setVisibility(View.GONE);
        BKHRow.setVisibility(View.GONE);
        BMRFRow.setVisibility(View.GONE);
        BRFRow.setVisibility(View.GONE);
        BRNRow.setVisibility(View.GONE);
        BRSRow.setVisibility(View.GONE);
        BRTRow.setVisibility(View.GONE);
        BTTRow.setVisibility(View.GONE);
        BUERow.setVisibility(View.GONE);
        BXTRow.setVisibility(View.GONE);
        CACRow.setVisibility(View.GONE);
        CHIRow.setVisibility(View.GONE);
        CKHRow.setVisibility(View.GONE);
        CLNRow.setVisibility(View.GONE);
        COLRow.setVisibility(View.GONE);
        CS1Row.setVisibility(View.GONE);
        CS2Row.setVisibility(View.GONE);
        CS3Row.setVisibility(View.GONE);
        CSGRow.setVisibility(View.GONE);
        CP0Row.setVisibility(View.GONE);
        CP1Row.setVisibility(View.GONE);
        CP2Row.setVisibility(View.GONE);
        CP3Row.setVisibility(View.GONE);
        CP4Row.setVisibility(View.GONE);
        CP5Row.setVisibility(View.GONE);
        CP6Row.setVisibility(View.GONE);
        CP7Row.setVisibility(View.GONE);
        CP8Row.setVisibility(View.GONE);
        CP9Row.setVisibility(View.GONE);
        CRLRow.setVisibility(View.GONE);
        CRPRow.setVisibility(View.GONE);
        CRRRow.setVisibility(View.GONE);
        DADRow.setVisibility(View.GONE);
        EIERow.setVisibility(View.GONE);
        EMHRow.setVisibility(View.GONE);
        ERARow.setVisibility(View.GONE);
        ERBRow.setVisibility(View.GONE);
        ESBRow.setVisibility(View.GONE);
        EVLRow.setVisibility(View.GONE);
        EXTRow.setVisibility(View.GONE);
        FAARow.setVisibility(View.GONE);
        FABRow.setVisibility(View.GONE);
        FCHRow.setVisibility(View.GONE);
        FH1Row.setVisibility(View.GONE);
        FH2Row.setVisibility(View.GONE);
        FH3Row.setVisibility(View.GONE);
        FH4Row.setVisibility(View.GONE);
        FH5Row.setVisibility(View.GONE);
        FH6Row.setVisibility(View.GONE);
        FRMRow.setVisibility(View.GONE);
        GRHRow.setVisibility(View.GONE);
        GSKRow.setVisibility(View.GONE);
        HODRow.setVisibility(View.GONE);
        HONRow.setVisibility(View.GONE);
        HSARow.setVisibility(View.GONE);
        HSNRow.setVisibility(View.GONE);
        HSSRow.setVisibility(View.GONE);
        KNPRow.setVisibility(View.GONE);
        LIBRow.setVisibility(View.GONE);
        LNCRow.setVisibility(View.GONE);
        LSBRow.setVisibility(View.GONE);
        LWCRow.setVisibility(View.GONE);
        LYTRow.setVisibility(View.GONE);
        MARRow.setVisibility(View.GONE);
        MBRCRow.setVisibility(View.GONE);
        MCARow.setVisibility(View.GONE);
        MCBRow.setVisibility(View.GONE);
        MCJRow.setVisibility(View.GONE);
        MCKRow.setVisibility(View.GONE);
        MECRow.setVisibility(View.GONE);
        MHHRow.setVisibility(View.GONE);
        MTLRow.setVisibility(View.GONE);
        NATRow.setVisibility(View.GONE);
        NDLRow.setVisibility(View.GONE);
        NIORow.setVisibility(View.GONE);
        NRCRow.setVisibility(View.GONE);
        NSHRow.setVisibility(View.GONE);
        NURRow.setVisibility(View.GONE);
        OGHRow.setVisibility(View.GONE);
        OWPRow.setVisibility(View.GONE);
        PASRow.setVisibility(View.GONE);
        PERRow.setVisibility(View.GONE);
        PSKRow.setVisibility(View.GONE);
        PURRow.setVisibility(View.GONE);
        SRCRow.setVisibility(View.GONE);
        RRIRow.setVisibility(View.GONE);
        SASRow.setVisibility(View.GONE);
        SLGRow.setVisibility(View.GONE);
        SMTRow.setVisibility(View.GONE);
        SPHRow.setVisibility(View.GONE);
        SSCRow.setVisibility(View.GONE);
        STARow.setVisibility(View.GONE);
        STLRow.setVisibility(View.GONE);
        SUMRow.setVisibility(View.GONE);
        SMNRow.setVisibility(View.GONE);
        STHRow.setVisibility(View.GONE);
        TMPRow.setVisibility(View.GONE);
        USCRow.setVisibility(View.GONE);
        VNBRow.setVisibility(View.GONE);
        VNGRow.setVisibility(View.GONE);
        WDBRow.setVisibility(View.GONE);
        WHIRow.setVisibility(View.GONE);
        WRSRow.setVisibility(View.GONE);
        RegistryRow.setVisibility(View.GONE);

    }

    public void viewBuildings()
    {
        //Updating Button Highlight
        MapSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray1));
        BuildingSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray2));

        //Hiding the Map
        MapRow.setVisibility(View.GONE);
        //Making Building Rows Visible
        TitleRow.setVisibility(View.VISIBLE);
        AELRow.setVisibility(View.VISIBLE);
        AGSRow.setVisibility(View.VISIBLE);
        ALHRow.setVisibility(View.VISIBLE);
        ARHRow.setVisibility(View.VISIBLE);
        ARMRow.setVisibility(View.VISIBLE);
        ARNRow.setVisibility(View.VISIBLE);
        ASARow.setVisibility(View.VISIBLE);
        BICRow.setVisibility(View.VISIBLE);
        BKHRow.setVisibility(View.VISIBLE);
        BMRFRow.setVisibility(View.VISIBLE);
        BRFRow.setVisibility(View.VISIBLE);
        BRNRow.setVisibility(View.VISIBLE);
        BRSRow.setVisibility(View.VISIBLE);
        BRTRow.setVisibility(View.VISIBLE);
        BTTRow.setVisibility(View.VISIBLE);
        BUERow.setVisibility(View.VISIBLE);
        BXTRow.setVisibility(View.VISIBLE);
        CACRow.setVisibility(View.VISIBLE);
        CHIRow.setVisibility(View.VISIBLE);
        CKHRow.setVisibility(View.VISIBLE);
        CLNRow.setVisibility(View.VISIBLE);
        COLRow.setVisibility(View.VISIBLE);
        CS1Row.setVisibility(View.VISIBLE);
        CS2Row.setVisibility(View.VISIBLE);
        CS3Row.setVisibility(View.VISIBLE);
        CSGRow.setVisibility(View.VISIBLE);
        CP0Row.setVisibility(View.VISIBLE);
        CP1Row.setVisibility(View.VISIBLE);
        CP2Row.setVisibility(View.VISIBLE);
        CP3Row.setVisibility(View.VISIBLE);
        CP4Row.setVisibility(View.VISIBLE);
        CP5Row.setVisibility(View.VISIBLE);
        CP6Row.setVisibility(View.VISIBLE);
        CP7Row.setVisibility(View.VISIBLE);
        CP8Row.setVisibility(View.VISIBLE);
        CP9Row.setVisibility(View.VISIBLE);
        CRLRow.setVisibility(View.VISIBLE);
        CRPRow.setVisibility(View.VISIBLE);
        CRRRow.setVisibility(View.VISIBLE);
        DADRow.setVisibility(View.VISIBLE);
        EIERow.setVisibility(View.VISIBLE);
        EMHRow.setVisibility(View.VISIBLE);
        ERARow.setVisibility(View.VISIBLE);
        ERBRow.setVisibility(View.VISIBLE);
        ESBRow.setVisibility(View.VISIBLE);
        EVLRow.setVisibility(View.VISIBLE);
        EXTRow.setVisibility(View.VISIBLE);
        FAARow.setVisibility(View.VISIBLE);
        FABRow.setVisibility(View.VISIBLE);
        FCHRow.setVisibility(View.VISIBLE);
        FH1Row.setVisibility(View.VISIBLE);
        FH2Row.setVisibility(View.VISIBLE);
        FH3Row.setVisibility(View.VISIBLE);
        FH4Row.setVisibility(View.VISIBLE);
        FH5Row.setVisibility(View.VISIBLE);
        FH6Row.setVisibility(View.VISIBLE);
        FRMRow.setVisibility(View.VISIBLE);
        GRHRow.setVisibility(View.VISIBLE);
        GSKRow.setVisibility(View.VISIBLE);
        HODRow.setVisibility(View.VISIBLE);
        HONRow.setVisibility(View.VISIBLE);
        HSARow.setVisibility(View.VISIBLE);
        HSNRow.setVisibility(View.VISIBLE);
        HSSRow.setVisibility(View.VISIBLE);
        KNPRow.setVisibility(View.VISIBLE);
        LIBRow.setVisibility(View.VISIBLE);
        LNCRow.setVisibility(View.VISIBLE);
        LSBRow.setVisibility(View.VISIBLE);
        LWCRow.setVisibility(View.VISIBLE);
        LYTRow.setVisibility(View.VISIBLE);
        MARRow.setVisibility(View.VISIBLE);
        MBRCRow.setVisibility(View.VISIBLE);
        MCARow.setVisibility(View.VISIBLE);
        MCBRow.setVisibility(View.VISIBLE);
        MCJRow.setVisibility(View.VISIBLE);
        MCKRow.setVisibility(View.VISIBLE);
        MECRow.setVisibility(View.VISIBLE);
        MHHRow.setVisibility(View.VISIBLE);
        MTLRow.setVisibility(View.VISIBLE);
        NATRow.setVisibility(View.VISIBLE);
        NDLRow.setVisibility(View.VISIBLE);
        NIORow.setVisibility(View.VISIBLE);
        NRCRow.setVisibility(View.VISIBLE);
        NSHRow.setVisibility(View.VISIBLE);
        NURRow.setVisibility(View.VISIBLE);
        OGHRow.setVisibility(View.VISIBLE);
        OWPRow.setVisibility(View.VISIBLE);
        PASRow.setVisibility(View.VISIBLE);
        PERRow.setVisibility(View.VISIBLE);
        PSKRow.setVisibility(View.VISIBLE);
        PURRow.setVisibility(View.VISIBLE);
        SRCRow.setVisibility(View.VISIBLE);
        RRIRow.setVisibility(View.VISIBLE);
        SASRow.setVisibility(View.VISIBLE);
        SLGRow.setVisibility(View.VISIBLE);
        SMTRow.setVisibility(View.VISIBLE);
        SPHRow.setVisibility(View.VISIBLE);
        SSCRow.setVisibility(View.VISIBLE);
        STARow.setVisibility(View.VISIBLE);
        STLRow.setVisibility(View.VISIBLE);
        SUMRow.setVisibility(View.VISIBLE);
        SMNRow.setVisibility(View.VISIBLE);
        STHRow.setVisibility(View.VISIBLE);
        TMPRow.setVisibility(View.VISIBLE);
        USCRow.setVisibility(View.VISIBLE);
        VNBRow.setVisibility(View.VISIBLE);
        VNGRow.setVisibility(View.VISIBLE);
        WDBRow.setVisibility(View.VISIBLE);
        WHIRow.setVisibility(View.VISIBLE);
        WRSRow.setVisibility(View.VISIBLE);
        RegistryRow.setVisibility(View.VISIBLE);
    }

    public boolean checkMarker(Marker marker)
    {
        boolean found = false;
        for(int i = 0; i<markers.size();i++)
        {
            if(markers.get(i).getTitle().equals(marker.getTitle()))
            {
                markers.get(i).remove();
                markers.remove(i);
                found = true;
            }
        }
        return found;
    }
}
