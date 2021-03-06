import React, { Component } from 'react';
import './classes.css';
import Button from '@material-ui/core/Button';

class Classes extends Component {
	constructor(props) {
		super(props);
	}

	render() {
		return (
			<div>
				<Button fullWidth={true} 
					style={this.props.selected ? {color: '#9fa6ad', backgroundColor: '#34404c'} : {}} 
					classes={{root: 'button'}} 
					onClick={() => this.props.handler(this.props.methods, this.props.name)}>
					{this.props.name}
				</Button>
				<div style={{height: 5}} />
			</div>
		)
	}
}
export default Classes;