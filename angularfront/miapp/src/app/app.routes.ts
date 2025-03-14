import { Routes } from '@angular/router';
import { ListaordenadorComponent } from './listaordenador/listaordenador.component';
import { FormularioOrdenadorComponent } from './formulario-ordenador/formulario-ordenador.component';

export const routes: Routes = [ 
     {path:"listaordenador",component:ListaordenadorComponent},
    {path:"formulario-ordenador",component:FormularioOrdenadorComponent},

    {path:"",component:ListaordenadorComponent},
];
