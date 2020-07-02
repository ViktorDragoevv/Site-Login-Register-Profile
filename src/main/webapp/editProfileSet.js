/**
 * 
 */
function firstBlock(){
	

    const data = toJSONString(document.querySelector('form.firstBlock'));
    const id=document.getElementsByName("sID");
    fetch('edtfirstblock?Usid='+id[0].value, {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json', 'Accept':'application/json'
        },
        body: data
      })
      .then(response => response.json())

      return false;

  }
function secondBlock(){
	

    const data = toJSONString(document.querySelector('form.secondBlock'));
    const id=document.getElementsByName("sID");
    fetch('editsecondblock?Usid='+id[0].value, {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json', 'Accept':'application/json'
        },
        body: data
      })
      .then(response => response.json())

      return false;

  }
function tirdBlock(){
	

    const data = toJSONString(document.querySelector('form.tirdBlock'));
    const id=document.getElementsByName("sID");
    fetch('edit3block?Usid='+id[0].value, {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json', 'Accept':'application/json'
        },
        body: data
      })
      .then(response => response.json())

      return false;

  }
function toJSONString( form ) {
	var obj = {};
	var elements = form.querySelectorAll( "input, select, textarea" );
	for( var i = 0; i < elements.length; ++i ) {
		var element = elements[i];
		var name = element.name;
		var value = element.value;

		if( name ) {
			obj[ name ] = value;
		}
	}

	return JSON.stringify( obj );
}