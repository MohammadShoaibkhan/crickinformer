import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HistoryComponent } from './history/history.component';
import { LiveComponent } from './live/live.component';
import { PointTableComponent } from './point-table/point-table.component';

export const routes: Routes = [
{
    path:"home",
    component:HomeComponent,
    title:"Home | CrickInformer"
},
     {
        path:"history",
        component:HistoryComponent,
        title:"Match History| CrickInformer"
     },
        {
            path:"live",
            component:LiveComponent,
            title:"Live Matches| CrickInformer"
         },
            
             {
                path:"point-table",
                component:PointTableComponent,
                title:"Point Table"
             }


];
